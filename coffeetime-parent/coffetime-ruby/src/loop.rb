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
i = 0
while i < 3
  puts "while #{i}"
  i += 1
end