class View
  attr_reader :width
  attr_reader :height

  def initialize(width, height)
    @width = width
    @height = height
  end

  def desc(prefix)
    "#{prefix} width = #{@width}, height = #{@height}"
  end
end

class Button < View
  attr_writer :name
  attr_accessor :width

  def initialize(width, height, name)
    super(width, height)
    @name = name
  end

  def desc(prefix)
    super << " ,name = #{@name}"
  end
end

class ViewGroup < View
  def initialize
  end
end

button = Button.new(480, 360, 'Simple Click')
puts button.desc(' =>')

view_group = ViewGroup.new
puts view_group.desc ' => '

puts button.class.superclass