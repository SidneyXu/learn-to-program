require 'dbi'

=begin
1. brew install mysql
2. gem install dbi
3. gem install mysql
4. gem install dbd-mysql
=end

begin
  # 连接到 MySQL 服务器
  dbh = DBI.connect("DBI:Mysql:test:localhost",
                    "tiger", "tiger")

  # way 1
  dbh['AutoCommit'] = false
  begin
    dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'John'")
    dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'Zara'")
    dbh.commit
  rescue
    puts "transaction failed"
    dbh.rollback
  end
  dbh['AutoCommit'] = true


  # way 2
  dbh['AutoCommit'] = false
  dbh.transaction do |dbh|
    dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'John'")
    dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'Zara'")
  end
  dbh['AutoCommit'] = true

rescue DBI::DatabaseError => e
  puts "An error occurred"
  puts "Error code:    #{e.err}"
  puts "Error message: #{e.errstr}"
ensure
  dbh.disconnect if dbh
end