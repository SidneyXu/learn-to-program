# Array
## Define
arr = Array.new(3)
arr2 = [1, 2, 3]
arr3 = []

## Length
puts "length of arr is #{arr.length}"

## Modify Elements
arr[0] = 10
arr2.push(15)
arr3 << 10

## Access Elements
puts "arr[0] is #{arr[0]}"
puts "arr2[-1] is #{arr2[-1]}"
puts "arr2.first is #{arr2.first}"
puts "arr2.last is #{arr2.last}"
puts "arr2[1..2] is #{arr2[1..2]}"

## Delete Elements
arr2.delete_at 2

## Traverse
for i in arr2
  print "#{i},"
end
puts ''

print "arr is #{arr}\n"
print "arr2 is #{arr2}\n"
print "arr3 is #{arr3}"
puts ''

x, y = [1, 2]
puts x
puts y

# Range
puts (1..3).class
(1..3).each { |i| print i }
puts ''
(1...3).each { |i| print i }
