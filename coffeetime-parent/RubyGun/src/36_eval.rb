# eval
# Execute Expression
result = eval('7 * 6')
puts result

# Define Function
eval('def zen; 42; end')
puts zen

# instance_eval
class Monk
  def initialize
    @x = 100
  end
end

Monk.instance_eval('def zen; 42; end', __FILE__, __LINE__)
puts Monk.zen
m = Monk.new
puts m.instance_eval('@x')
# Support block, different from eval
puts m.instance_eval { @x +=1 }

# class_eval
Monk.class_eval('def sum(x,y); x+y; end')
Monk.class_eval('def inc(x); sum(x, 1); end')
mm = Monk.new
puts mm.inc(19)
