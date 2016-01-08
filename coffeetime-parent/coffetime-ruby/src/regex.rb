line1 = 'Cats are smarter than dogs'

if line1 =~ /Cats(.*)/
  puts 'Line1 starts with Cats'
end

line2 = 'hello'
if line2 =~ /Hello/im
  puts 'ignores case'
end

# replace first
phone = '2004-959-559 #This is Phone Number'
phone = phone.sub!(/#.*$/, '')
puts "Phone Num : #{phone}"

# replace all
puts 'abbc'.gsub(/a/, 'b') # bbbc
puts 'abbc'.gsub!(/a/, 'b') # bbbc
puts 'abbc'.gsub(/d/, 'a') # abbc
puts 'abbc'.gsub!(/d/, 'a') # nil
