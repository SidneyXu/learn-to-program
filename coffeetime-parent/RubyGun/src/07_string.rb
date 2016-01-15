# Literals
s = 'Hello World'
ds = "Hello World"

puts 'foo' + 'bar'
puts 'foo' << 'bar'

# Iterator
for c in s.chars
  puts c
end

# Multiple Lines
text = %q{
    1, 2, 3, #{s}
    one, two, three
    "x, "y", "z"
}
dtext = %Q{
    1, 2, 3, #{s}
    one, two, three
    "x, "y", "z"
}
symbol_text = <<NAME
    1, 2, 3, #{s}
    one, two, three
    "x, "y", "z"
NAME
puts text
puts dtext
puts symbol_text

puts <<'foo', <<'bar'
"hello"
foo
'world'
bar


# String Interpolation
name = 'Peter'
str = "name=#{name}, #{
if name.length>10;
else
  name.length
end}"
puts str

single_quote = 'name=#{name}, #{if name.length>10; else name.length end}'
puts single_quote

# Methods

## SubString
puts 'Hello World'[6..9]

## Format
puts 'name=%s&length=%d' % [name, name.length]

## Replace
puts 'Hello World'.gsub!(/o/, '-')

## Times
puts 'a' * 3
