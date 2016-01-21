unless Dir.exist? 'files'
  Dir.mkdir 'files'
end

Dir.foreach('/') do |entry|
  puts entry
end

puts File.exist? 'files/test.txt'

Dir.chdir('files')
file = File.new('test.txt', 'w')
file.syswrite('hello world')
file.write('foobar')
file.print("world\n")
file.puts('bye')
file.close

File.open('test.txt', 'r') do |file|
  puts "read: #{file.read}"
end

lines = IO.readlines('test.txt')
puts "line: #{lines[0]}"

IO.foreach('test.txt') { |block| puts "each: #{block}" }
file = File.new('test.txt', 'r')
file.each_byte {|ch| putc ch}

