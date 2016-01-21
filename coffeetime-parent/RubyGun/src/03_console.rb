# Console input/output
print 'How old are you? '
age = STDIN.gets.chomp
print 'How tall are you? '
height = STDIN.gets.chomp
print 'How much do you weigh? '
weight = STDIN.gets.chomp

puts "So, you're #{age} old, #{height} tall and #{weight} heavy."

# Console Parameters
# ruby 03_console.rb one two three
first, second, third = ARGV

puts "The script is called: #{$0}"
puts "Your first variable is: #{first}" # one
puts "Your second variable is: #{second}" # two
puts "Your third variable is: #{third}" # three