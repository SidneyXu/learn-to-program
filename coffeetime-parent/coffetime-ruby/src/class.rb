class Person
  privateName = ""
  attr_reader :name
  attr_accessor :age

  def initialize
    name = "no name"
    @age = 0
    @sex = "male"
  end

  def setAge(a)
    @age = a
    @age
  end

end

peter = Person.new
peter.setAge(18)
puts peter.name
puts peter.age

