name = "Tom"
sex = "male"
age = 18

# Connect Strings
puts name + sex

# String Formatter
puts "Let's talk about %s." % name
puts 'He is a %s in %d years old.' % [sex, age]

# String Template
puts "#{name} is a #{sex}"

# Escape
puts "I am 'Terry'."

# Document Syntax
puts <<PARAGRAPH
There's something going on here.
With the three double-quotes.
We'll be able to type as much as we like.
Even 4 lines if we want, or 5, or 6.
PARAGRAPH