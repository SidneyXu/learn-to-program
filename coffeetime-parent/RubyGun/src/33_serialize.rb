require 'YAML'

class Employee

  attr_reader :name

  def initialize(name, salary)
    @name = name
    @salary = salary
  end

  def self.deserialize(yaml_string)
    YAML::load(yaml_string)
  end

  def serialize
    YAML::dump(self)
  end

end

peter = Employee.new('Peter', 2000)
yaml = peter.serialize
p yaml
peter_again = Employee.deserialize(yaml)
puts peter_again.name

jane = Employee.new('Jane', 1800)
employees = [peter, jane]
puts "array is #{employees}"