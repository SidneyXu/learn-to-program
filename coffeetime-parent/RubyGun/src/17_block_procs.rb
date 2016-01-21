# Block
def cube
  puts 'You are in the method'
  yield(3)
  puts 'You are again back to the method'
  yield(4)
end
def cube2(x, &f)
  f.call(x)
end

cube { |x| puts "x * 3 is #{x * 3}" }
cube2(4){ |x| puts "x * 4 is #{x * 4}" }


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