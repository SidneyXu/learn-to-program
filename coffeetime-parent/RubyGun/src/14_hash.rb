# Define
peter = {:name => 'Peter', :age => 18, 'height' => 180, 'nickname' => 'Pen'}
jack = [:name, 'Jack', :age, 20, :height, 178]
jane = {name: 'Jane', age: 16, height: 160}

# Empty Map
empty = {}
puts empty
hash = Hash.new
puts hash

# Access Elements
puts peter[:name]
puts peter['height']

# Modify Elements
peter[:sex] = 'male'
peter['no'] = 10

# Delete Elements
peter.delete(:age)

# Length
puts peter.length

# Traverse
peter.each { |k, v| puts "#{k} = #{v}" }

# Exist
puts peter.include? :name
puts peter.include? :weight
