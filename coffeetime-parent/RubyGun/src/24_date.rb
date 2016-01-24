require 'Time'

# Current Time
time1 = Time.new
puts time1.inspect

time2 = Time.now
puts time2.inspect

# Timestamp
puts time1.to_i

# Query Fields
puts time1.year
puts time1.month
puts time1.day
puts time1.wday

# Time Zone
puts Time.local(2008, 7, 8)
puts Time.local(2008, 7, 8, 9, 10)
puts Time.utc(2008, 7, 8, 9, 10)

# Format
puts time1.strftime('%Y-%m-%d %H:%M:%S')
puts Time.parse('2014-04-23').inspect

# Calc
puts time2 - 10 # 10 seconds ago