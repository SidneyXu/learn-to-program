# auto close block
dbh = DBI.connect("DBI:Mysql:TESTDB:localhost",
                  "testuser", "test123") do |dbh|

end

dbh.prepare("SHOW DATABASES") do |sth|
  sth.execute
  puts "Databases: " + sth.fetch_all.join(", ")
end


dbh.execute("SHOW DATABASES") do |sth|
  puts "Databases: " + sth.fetch_all.join(", ")
end