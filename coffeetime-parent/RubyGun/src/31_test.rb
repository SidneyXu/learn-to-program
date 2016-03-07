require 'test/unit'
require_relative '../src/15_class'

class PersonTest < Test::Unit::TestCase
  def testCore
    peter = Person.new('Peter')
    peter.sex = 'male'
    assert_equal('male', peter.sex)
  end

  def test01
    puts 'foobar'
  end
end