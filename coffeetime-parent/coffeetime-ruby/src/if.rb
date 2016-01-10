def compare(x, y)
  if x > y
    puts "#{x} is larger than #{y}"
  elsif x < y
    puts "#{x} is smaller than #{y}"
  else
    puts "#{x} is equal to #{y}"
  end
end

compare(1, 2)
compare(2, 1)
compare(2, 2)


x = 11
puts "x>10" if x>10
puts "x<10" if x<10

unless x >15
  puts "x<15"
else
  puts "x>15"
end

case x
  when 0..2
    puts '0..2'
  when 3..6
    puts '3..6'
  when 7..10
    puts '7..10'
  else
    puts 'other'
end