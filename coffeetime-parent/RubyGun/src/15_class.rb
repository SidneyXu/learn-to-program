# Define
class Person

  attr_reader :name
  attr_writer :age
  attr_accessor :sex

  def initialize(name)
    @name = name
    @age = 0
    @sex = 'male'
  end

  def set_age(n)
    @age = n
    @age
  end

  def show
    info = "name=#{@name},age=#{@age}"
  end

end

# Object
peter = Person.new('Peter')
puts peter.set_age 10
puts peter.name
# puts peter.age
puts peter.sex

puts peter.show