# Array
## Define
arr = Array.new(3)
arr2 = [1, 2, 3]
arr3 = []
arr4 = Array(1..9)
arr5 = Array[1, 2, 3]
arr6 = Array.new(3) { |x| x * 3 }
print arr4
print arr5
print arr6
puts ''

## Length
puts "length of arr is #{arr.length}"
puts "length of arr is #{arr.size}"

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
arr2.delete_at 2 # index
arr2.delete(15) # element
[1, 2, 3, 4, 5, 6, 7, 8, 9].delete_if { |i| i % 2 == 0 }

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

## Operation
[1, 2, 3, 4, 5].map { |i| i * 3 }
['one', 'two', 'three', 'four', 'six'].select { |name| name.length > 3 }

# Range
puts (1..3).class
(1..3).each { |i| print i }
puts ''
(1...3).each { |i| print i }
puts ''

('a'..'d').each { |c| print c }
puts ''
'a'.upto('d').each { |c| print c }
