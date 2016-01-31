# Global Variables
$global_variable = 10

# Define
class Person

  attr_reader :name
  attr_writer :age
  attr_accessor :sex

  @@counter = 0

  def initialize(name)
    @name = name
    @age = 0
    @sex = 'male'
    @@counter += 1
    $global_variable += 1
  end

  def set_age(n)
    @age = n
    @age
  end

  def show
    info = "name=#{@name},age=#{@age}"
  end

  def print_counter
    puts "counter is #{@@counter}"
  end
end

class Foobar
  def initialize
    $global_variable += 1
  end
end

# Object
peter = Person.new('Peter')
puts peter.set_age 10
puts peter.name
# puts peter.age
puts peter.sex
puts peter.show

Person.new('Jack')
Foobar.new
peter.print_counter
puts "global variable is #{$global_variable}"


# Class Object
puts 1.class
puts [].class
puts 1.is_a?(Integer)

# Class Function
class Machine
  def hello
    puts 'hello member function'
  end

  def Machine.hello
    puts 'hello class function'
  end

  def self.hello2
    puts 'hello2 class function'
  end

  class << Machine
    def hello3
      puts 'hello3 class function'
    end
  end
  class << self
    def hello4
      puts 'hello4 class function'
    end
  end
end
m = Machine.new
m.hello
Machine.hello
Machine.hello2
Machine.hello3
Machine.hello4

# Single Function
def m.singleMethod1
  puts 't1 single method'
end

class << m
  def singleMethod2
    puts 't2 single method'
  end
end

m.singleMethod1
m.singleMethod2

# Eigenclass
eigenclass = class << m
  self
end
puts eigenclass.class
puts eigenclass.instance_methods.grep(/singleMethod./)

# p
class Item
  def initialize(name)
    @name = name
  end

  def inspect
    'Result of inspect'
  end
end
class ItemList
  def initialize(name, items)
    @name = name
    @items = items
  end
end

item = Item.new('item01')
puts item
puts item.to_s
p item

items = ItemList.new('itemlist', [item])
puts items
p items