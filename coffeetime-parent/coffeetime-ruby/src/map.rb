peter = {:name => 'Peter', :age => 18, :height => 180, 'nickname' => 'Pen'}
puts peter[:name] # Peter
puts peter['nickname'] # Pen

peter[:sex] = 'male'
peter[1] = 20
puts peter # {:name=>"Peter", :age=>18, :height=>180, "nickname"=>"Pen", :sex=>"male", 1=>20}

peter.delete(:height)
peter.delete(1)

puts peter # {:name=>"Peter", :age=>18, "nickname"=>"Pen", :sex=>"male"}

def sayHello(map, key)
  if map.include? key
    map[key]
  else
    'Not Found'
  end
end

peter[:hello] = method(:sayHello)
puts peter[:hello].call(peter, 'nickname') # Pen
puts peter.include? :name # true
