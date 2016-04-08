nums = [1, 2, 3, 4, 5]

# For
for n in nums
  puts "for-in #{n}"
end

nums.each do |n|
  puts "each #{n}"
end

for n in (1..10).step(3)
  puts "for-range #{n}" # 1 4 7 10
end

# Times
3.times { |i| puts "times #{i}" }


# While
## 1
i = 0
while i < 3
  puts "while #{i}"
  i += 1
end

## 2
i = 0
puts i += 1 while i < 3

## 3
begin
  puts i -= 1
end while i > 0


# Loop
i = 0
loop do
  i += 1
  print "loop #{i}"
  break if i > 5
end
puts ''

# Until
i = 6
num = 9
until i > num do
  puts "Inside the loop i = #{i}"
  i +=1
end

i = 0
i += 1 until i > 5
puts i

begin
  i -= 1
end until i < 0
puts i

puts ''

# Break and Continue
for i in 1..5
  break if i == 3
  puts "break #{i}"
end
puts ''

for i in 1..5
  next if i == 3
  puts "next #{i}"
end
puts ''

# Redo
i = 0
while i < 3
  puts "redo #{i}"
  i+=1
  if i == 2
    i = 10
    redo
  end
end