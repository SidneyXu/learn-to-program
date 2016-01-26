class Dog
  attr_accessor :breed

  def initialize(name, breed)
    @name = name
    @breed = breed
  end

  public
  def bark
    puts 'Woof!'
  end

  def echo
    puts info
  end

  private
  def info
    "name=#{@name}, breed=#{@breed}"
  end

  protected
  def jump
    puts 'Jump!'
  end
end

class SuperDog < Dog
  def fly
    jump
    puts 'fly'
  end
end

dog = Dog.new('Clark', 'foobar')
dog.bark
dog.echo

super_dog = SuperDog.new('Super Clark', 'foobar')
super_dog.fly

# freeze
dog.breed = 'foo'
puts dog.breed
dog.freeze
# can't modify frozen Dog
# dog.breed = 'bar'
if dog.frozen?
  puts 'frozen object'
else
  puts 'normal object'
end