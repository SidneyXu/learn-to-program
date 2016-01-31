# Block
def cube
  puts 'You are in the method'
  yield(3)
  puts 'You are again back to the method'
  yield(4)
end

cube { |x| puts "x * 3 is #{x * 3}" }

## implicit -> explicit
def calculation(a, b, &block)
  block.call(a, b)
end

puts calculation(3, 4) { |a, b| a + b }

## explicit -> implicit
def calculation2(a, b)
  yield(a, b)
end

add = lambda { |x, y| x + y }
puts calculation2(3, 4, &add)

def foo
  yield if block_given?
end

foo { puts 'foobar' }
foo

# Proc
cube = Proc.new { |x| x * 3 }

## Invoke
print [1, 2, 3].collect!(&cube)
puts ''
print cube.call([2, 4, 6])
puts ''

## Reference
puts [1, 2, 3].collect(&:to_s)

## If Function Exist
puts [1, 2, 3].respond_to?(:collect)
puts "End Proc\n\n"

# Lambda
triple = lambda { |x| x * 3 }

## Invoke
print [1, 2, 3].collect!(&triple)
puts ''
print triple.call([2, 4, 6])


# Lambda vs Proc
def batman_ironman_proc
  victor = Proc.new { return 'Batman will win!' }
  victor.call
  'Iron Man will win!'
end

puts batman_ironman_proc # Batman will win!

def batman_ironman_lambda
  victor = lambda { return 'Batman will win!' }
  victor.call
  'Iron Man will win!'
end

puts batman_ironman_lambda #  Iron Man will win!