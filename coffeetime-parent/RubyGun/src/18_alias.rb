# alias
$PI = 3.14

def calc(x, y)
  x + y
end

puts $PI # 3.14
puts calc(5, 3) # 8

alias $FOO $PI
$PI = 5
puts $PI # 5
puts $FOO # 5

alias f calc

def calc(x, y)
  x - y
end

puts calc(5, 3) # 2
puts f(5, 3) # 8

# undef
undef calc
puts defined? calc
