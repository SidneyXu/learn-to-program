# Define
def hello
  return 'hello'
end

# ! ?
str = 'FooBar'
puts str.downcase!
puts str.include? 'foo'

# Varargs
def sum(*n)
  result = 0
  n.each { |i| result += i }
  return result
end

def dec(*n)
  x, y = n
  puts "#{x} - #{y} = #{x - y}"
end

# Default Values
def say(name, word = "hello")
  puts "#{name}, #{word}"
end

# Return Values
def add(x, y)
  x + y
end

def triple(x, y, z)
  return x * 3, y * 3, z * 3
end

puts hello()
puts hello
puts "sum(1,2,3) is #{sum(1, 2, 3)}"
puts dec(10, 3)
puts dec 10, 3
say('Peter')
puts "add(1,2) is #{add(1, 2)}"
x, y, z = triple(1, 2, 3)
puts x, y, z

# Named Parameters
def add(a_number, another_number, options = {})
  sum = a_number + another_number
  sum = sum.abs if options[:absolute]
  sum = sum.round(options[:precision]) if options[:round]
  sum
end

puts add(1.0134, -5.568)
puts add(1.0134, -5.568, absolute: true)
puts add(1.0134, -5.568, absolute: true, round: true, precision: 2)

# Check If Function Exist
puts [1, 2, 3].respond_to?(:push) # true
puts [1, 2, 3].respond_to?(:to_sym) # false

# Function with Symbol
action = method(:sum)
puts action.call(2, 3)