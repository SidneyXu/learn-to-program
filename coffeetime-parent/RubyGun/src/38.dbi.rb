require 'dbi'

=begin
chmod go-w /Users/mrseasons/.nvm
1. brew install mysql
2. gem install dbi
3. gem install mysql
4. gem install dbd-mysql
=end

begin
  dbh = DBI.connect("DBI:Mysql:test:localhost",
                    "tiger", "tiger")
  row = dbh.select_one("SELECT VERSION()")
  puts "Server version: " + row[0]




  dbh.commit

rescue DBI::DatabaseError => e
  puts "An error occurred"
  puts "Error code:    #{e.err}"
  puts "Error message: #{e.errstr}"
ensure
  dbh.disconnect if dbh
end