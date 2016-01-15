require 'bigdecimal'

# Everything is Object
# Data Type
x = 2
y = 0.1
flag = false
c = 'a'
foo = 'foo'

puts x.class
puts y.class
puts flag.class
puts true.class
puts c.class
puts foo.class
puts [].class

# BigDecimal
puts 2-1.8
puts BigDecimal.new('2')-BigDecimal.new('1.8')

# Type Conversion
puts 10.to_s.class

# Type Inference
if foo.is_a? String
  puts 'foo is a String'
end
