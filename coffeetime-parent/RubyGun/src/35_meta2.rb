# method missing
class Spy
  def method_missing(method_name, *args, &block)
    puts "#{method_name} was called with #{args} and #{block}"
  end
end
spy = Spy.new
spy.hello('hello', 'world') { |n| puts n }

# send and agent
class Wrapper
  def initialize(agent)
    @agent = agent
  end

  def method_missing(method_name, *args, &block)
    @agent.send(method_name, *args)
  end
end

wrapper= Wrapper.new([10, 20, 30])
puts wrapper.max

# another way to define methods
class Doctor
  define_method('perform_rhinoplasty') do |argument|
    "performing rhinoplasty on #{argument}"
  end

  define_method('perform_checkup') do |argument|
    "performing checkup on #{argument}"
  end

  define_method('perform_interpretive_dance') do |argument|
    "performing interpretive dance on #{argument}"
  end
end

doctor = Doctor.new
puts doctor.perform_rhinoplasty("nose")
puts doctor.perform_checkup("throat")
puts doctor.perform_interpretive_dance("in da club")

class SuperDoctor
  ["rhinoplasty", "checkup", "interpretive_dance"].each do |action|
    define_method("perform_#{action}") do |argument|
      "performing #{action.gsub('_', ' ')} on #{argument}"
    end
  end
end

doctor = SuperDoctor.new
puts doctor.perform_rhinoplasty("nose")
puts doctor.perform_checkup("throat")
puts doctor.perform_interpretive_dance("in da club")