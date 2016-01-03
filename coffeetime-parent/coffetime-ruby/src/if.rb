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
