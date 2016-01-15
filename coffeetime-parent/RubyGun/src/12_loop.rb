nums = [1, 2, 3, 4, 5]

# For
for n in nums
  puts "for-in #{n}"
end

nums.each do |n|
  puts "each #{n}"
end

for n in (1..3)
  puts "for-in #{n}"
end


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


# Until
i = 6
num = 3
until i > num do
  puts("Inside the loop i = #{i}")
  i +=1
end