input = '99 bottles, 98 bottles'

# Regex
regex = /[0-9]+\W/
regex = Regexp.new('[0-9]+\W')
regex = %r{[0-9]+\W}

# Matching
puts input =~ regex # 0

line = 'hello'
if line =~ /Hello/im
  puts 'ignores case'
end

# Searching
result = /(\d{4})-(\d{2})/.match '2015-10'
puts result.size # 3
puts result # 2015-10
result.captures.each { |m| puts "match: #{m}" }

# Replacing
## Replacing First
phone = '2004-959-559 #This is Phone Number'
phone = phone.sub!(/#.*$/, '')
puts "Phone Num : #{phone}"

## Replacing All
puts 'abbc'.gsub(/a/, 'b') # bbbc
puts 'abbc'.gsub!(/a/, 'b') # bbbc
puts 'abbc'.gsub(/d/, 'a') # abbc
puts 'abbc'.gsub!(/d/, 'a') # nil