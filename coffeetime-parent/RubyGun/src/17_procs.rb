# Define
cube = Proc.new { |x| x * 3 }

# Invoke
print [1, 2, 3].collect!(&cube)
puts ''
print cube.call([2, 4, 6])
puts ''

# Reference
puts [1, 2, 3].collect(&:to_s)

# If Function Exist
puts [1, 2, 3].respond_to?(:collect)