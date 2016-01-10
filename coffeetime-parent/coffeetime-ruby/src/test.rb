require 'test/unit'
require_relative './class'

class PersonTest < Test::Unit::TestCase
  def testCore
    peter = Person.new
    peter.age = 20
    assert_equal(20, peter.age)
  end
end
