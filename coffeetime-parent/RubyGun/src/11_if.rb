x = 1
y = 2

# If
if x > y
  puts "#{x} is larger than #{y}"
elsif x < y
  puts "#{x} is smaller than #{y}"
else
  puts "#{x} is equal to #{y}"
end

empty = nil
if empty
  puts 'not empty'
else
  puts 'empty'
end

# Unless
unless x + y > 5
  puts 'x'
else
  puts 'y'
end

# Conditional
puts 'x + y > 3' if x + y > 3
puts 'x + y < 3' unless x + y < 3