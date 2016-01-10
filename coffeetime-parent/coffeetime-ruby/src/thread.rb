# Create a Thread
t = Thread.new {
  puts "begin"
  sleep(2) # 单位:秒
  puts "end"
}
t.join
puts "end thread"
puts Thread.current

# Exception in Thread
Thread.new {
  sleep(1)
  # 1/0
}

puts 'one'

t=Thread.new {
  sleep(1)
   # 1/0
}
t.abort_on_exception=true

puts 'two'

# Thread Local
t=Thread.new {
  Thread.current["mycount"] = 10
}
t.join
print t["mycount"]


# Mutax
require 'thread'
mutex = Mutex.new

count1 = count2 = 0
difference = 0
counter = Thread.new do
  loop do
    mutex.synchronize do
      count1 += 1
      count2 += 1
    end
  end
end
spy = Thread.new do
  loop do
    mutex.synchronize do
      difference += (count1 - count2).abs
    end
  end
end
sleep 1
mutex.lock
puts "count1 :  #{count1}"
puts "count2 :  #{count2}"
puts "difference : #{difference}"

# Cond
mutex = Mutex.new
cv = ConditionVariable.new
a = Thread.new {
  mutex.synchronize {
    puts "A: I have critical section, but will wait for cv"
    cv.wait(mutex)
    puts "A: I have critical section again! I rule!"
  }
}

puts "(Later, back at the ranch...)"

b = Thread.new {
  mutex.synchronize {
    puts "B: Now I am critical, but am done with cv"
    cv.signal
    puts "B: I am still critical, finishing up"
  }
}
a.join
b.join