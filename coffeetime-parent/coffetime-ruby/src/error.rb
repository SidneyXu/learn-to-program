def str2int(n)
  begin
    result = Integer(n)
    if result == 1
      raise Exception.new('something wrong')
    end
    result
  rescue ArgumentError
    0
  rescue Exception
    100
  end
end

puts str2int(10)  # 10
puts str2int('10')  # 10
puts str2int('1a0') # 0
puts str2int('a10') # 0
puts str2int('1')