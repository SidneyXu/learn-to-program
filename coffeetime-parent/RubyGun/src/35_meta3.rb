# Inspect
class Mock
  Foo = 'foo'

  def initialize
    @sum = 100
  end

  def add(x, y)
    x+y
  end

  private
  def info
    'info'
  end
end

mock = Mock.new
method_add = mock.method(:add)
p method_add
p method_add.parameters
# the object on which the method is bound
p method_add.receiver
# the class that object belongs to
p method_add.owner

# Analysis
p mock.methods
p mock.public_methods

# Constants
CONSTANT_A = 100
puts CONSTANT_A
puts Module.const_get('CONSTANT_A')

# Construct an object by constant
puts Module.const_get('Mock').new.add(2, 3)

# Construct in Scope
puts Mock.const_get('Foo')

# Instant Variable
p mock.instance_variable_get('@sum')