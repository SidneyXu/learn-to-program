def add(x, y)
  x + y
end

def dec(*n)
  x, y = n
  puts "#{x} - #{y} = #{x - y}"
end

def hello()
  puts "hello world"
end

def triple(x, y, z)
  return x * 3, y * 3, z * 3
end

puts "add(1,2) is #{add(1, 2)}"
dec(10, 3)
hello()
hello
x, y, z = triple(1, 2, 3)
puts x, y, z
