# Add Method
class EmptyClass
end

class EmptyClass
  def everything_changes
    'Wait, what? You just added a method to me!'
  end
end

puts EmptyClass.new.everything_changes

# Redefine
class EmptyClass
  def everything_changes
    'Redefine everything changes!'
  end
end

puts EmptyClass.new.everything_changes

# Dynamic Method Call
class Glider
  def lift
    'do lift'
  end

  def turn(dir)
    "do turn #{dir}"
  end
end
class Nomad
  def initialize(glider)
    @glider = glider
  end

  def do(action, args = nil)
    if args==nil
      @glider.send(action)
    else
      @glider.send(action, args)
    end
  end
end

nomad = Nomad.new(Glider.new)
puts nomad.do('lift')
puts nomad.do('turn', 'left')

class Array
  def fold1(op)
    inject { |result, i|
      # send() call method by name
      result.send(op, i)
    }
  end
end

puts [1000, 20, 2, 25].fold1('/')
puts [1, 2, 3, 4, 5].fold1('+')
