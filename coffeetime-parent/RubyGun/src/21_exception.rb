def str2int(n)
  begin
    result = Integer(n)
    if result == 1
      raise Exception.new('something wrong')
    end
  rescue ArgumentError => error
    puts error.backtrace
    0
  rescue Exception
    n = 67
    retry
  else
    puts 'success'
    result
  ensure
    puts 'finally'
    300
  end
end

puts str2int(10) # 10
puts str2int('10') # 10
puts str2int('1a0') # 0
puts str2int('a10') # 0
puts str2int('1') # 67


def promptAndGet(i)
  for j in i..20
    catch :quit do
      throw :quit if j == 3
      puts "j is #{j}"
    end
  end
end

promptAndGet(5)
promptAndGet(3)