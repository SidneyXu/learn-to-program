# Comment
# Single Comment
=begin
multiple
lines
comment
=end

# Operator
## Math
puts 3 + 2 < 5 -7 # false
x = 10
x += 1
# x++ not support
puts x # 11

## Logic
puts true and 1 == 2 # true
puts true && 1 == 2 # false
puts true or 1 == 2 # true
puts true || 1 == 2 # true
puts !true # false
puts (not (1==1)) # false
puts 3 > 2 ? '3>2' : '3<=2' # 3>2

## Equals
puts 1 == 1 # true
puts 1 != 2 # true
puts 'foo' == 'foo' # true

### Between Number
puts 1 == 1.0 # true
puts 1.eql? 1.0 # false

### Between Object
foo = 'foo'
foo_dup = foo.dup
puts foo == foo_dup # true
puts foo.equal? foo_dup # false

### Comparator
book_1 = 'A Wrinkle in Time'
book_2 = 'A Brief History of Time'
puts book_1 <=> book_2  # 1

books = ['Charlie and the Chocolate Factory', 'War and Peace', 'Utopia', 'A Brief History of Time', 'A Wrinkle in Time']
puts books.sort! { |firstBook, secondBook| firstBook <=> secondBook }


