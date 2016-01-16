peter = {:name => 'Peter', :age => 18, :height => 180, 'nickname' => 'Pen'}

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
