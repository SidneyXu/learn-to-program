# require
require './utils'
require './utils'

StrUtils.echo
puts StrUtils::COUNT

# load './utils.rb'
# load './utils.rb'
# StrUtils.echo

# include and included
include StrUtils
# puts echo()
sentents = ['z', 'b', 'e', 'p']
puts StrUtils.sort_words(sentents)
puts sort_words(sentents)

# inheritance
module A
  def a1
    puts 'a1'
  end

  def a2
    puts 'a2'
  end

  def self.included(base)
    puts "A is included in #{base}"
  end
end
module B
  def b1
    puts 'b1'
  end

  def b2
    puts 'b2'
  end
end
module C
  def c1
    puts 'c1'
  end

  def self.extended(base)
    puts "A is extended in #{base}"
  end
end

class Sample
  include A
  include B
  extend C

  def s1
    puts 's1'
  end
end

samp = Sample.new
samp.a1
samp.a2
samp.b1
samp.b2
samp.s1
Sample.c1

samp.extend C
samp.c1

# Declare Class and Module like string
dog = Module.new do
  def speak
    puts 'speak'
  end
end
cat = Class.new do
  def jump
    puts 'jump'
  end
end
kitty = cat.new
kitty.extend(dog)
kitty.speak
