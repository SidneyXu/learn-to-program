# Thread
t = Thread.new {
  puts 'begin'
  sleep(2) # second
  puts 'end'
}
t.join
puts 'sync'
puts Thread.current

# Exception
begin
  t1 = Thread.new {
    1 / 0
  }
  puts 'one'

  t2 = Thread.new {
    1 / 0
  }
  t2.abort_on_exception = true
  puts 'two'

  sleep(1)
rescue ZeroDivisionError
  puts 'error occurs'
end

# ThreadLocal
t = Thread.new {
  Thread.current['count'] = 10
}
t.join
print t['count']