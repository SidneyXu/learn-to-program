class Person

  attr_accessor :name

  def initialize(name)
    @name = name
  end
end

class Boss < Person
  def initialize
  end
end

class Employee < Person

  attr_reader :salary

  def initialize(name, salary)
    super(name)
    @salary = salary
  end
end

peter = Employee.new("Peter", 1000)
jack = Boss.new
puts peter.salary
puts peter.name
puts jack.name
