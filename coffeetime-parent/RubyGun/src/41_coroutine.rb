require 'fiber'

f = Fiber.new do
  puts 'execute fiber()'
  Fiber.yield 1
  Fiber.yield 2
end

puts f.resume
puts f.resume

f1 = Fiber.new do |other|
  print 'hello'
  other.transfer
end

f2 = Fiber.new do
  puts ' world'
end

f1.resume f2