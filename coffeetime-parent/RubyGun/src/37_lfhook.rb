# Life Cycle Hook
# object lifecycle callbacks
class Dojo
  @@method_added = []
  @@methods_removed = []
  @@methods_undefined = []

  def self.method_added(method_name)
    puts "a new method '#{method_name}' has added"
    @@method_added << method_name
  end

  def self.all_added_methods
    "class contains #{@@method_added}"
  end

  def self.method_removed(method_name)
    puts "a new method '#{method_name}' has removed"
    @@methods_removed << method_name
  end

  def self.method_undefined(method_name)
    puts "a new method '#{method_name}' become undefined"
    @@methods_undefined << method_name
  end

  def foo

  end

  def bar

  end

  def self.remove_foo
    remove_method(:foo)
  end

  def self.undef_bar
    undef :bar
  end
end

puts Dojo.all_added_methods
d1 = Dojo.new

def d1.singleton_method_added(method_name)
  puts "a new singleton method '#{method_name}' has added"
  @singleton_methods_added ||= []
  @singleton_methods_added << method_name
end

def d1.all_added_singleton_methods
  "instance contains #{@singleton_methods_added}"
end

def d1.inc(x)
  x+ 1
end

puts d1.inc(3)
puts d1.all_added_singleton_methods

Dojo.remove_foo
Dojo.undef_bar


# Inclusion
# Module Inclusion
module SparringArea
  @@included_into = []

  def self.included_into
    @@included_into
  end

  def self.included(class_or_module)
    puts "class_or_module '#{class_or_module}' is included"
    @@included_into << class_or_module
  end
end

include SparringArea
puts SparringArea.included_into

# Object Extension
class Dojo
end

module SparringArea
  @@extended_objects = []

  def self.extended_objects
    @@extended_objects
  end

  def self.extended(object)
    puts "object '#{object}' is extended"
    @@extended_objects << object
  end
end

dojo1 = Dojo.new
dojo2 = Dojo.new
dojo1.extend(SparringArea)
dojo2.extend(SparringArea)

# Inheritance
class Room
  @@subclasses = []

  def self.subclasses
    @@subclasses
  end

  def self.inherited(subclass)
    puts "subclass '#{subclass}' inherits Room"
    @@subclasses << subclass
  end
end
class SmallRoom < Room
end