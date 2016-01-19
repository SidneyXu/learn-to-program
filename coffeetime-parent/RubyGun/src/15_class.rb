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