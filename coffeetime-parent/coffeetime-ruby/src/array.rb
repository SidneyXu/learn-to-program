arr = []

arr.push(3)
arr.push(4)
arr.push(5)

arr[0] = 10
puts arr[1] # 4
puts arr[-1]  # 5
puts arr.first  # 10
puts arr.last # 5

puts arr #  10 4 5

puts arr.join(',')  # 10,4,5
puts arr.values_at(1,2) # 4 5

puts arr.pop  # 5

