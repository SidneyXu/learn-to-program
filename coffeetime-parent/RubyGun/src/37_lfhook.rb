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