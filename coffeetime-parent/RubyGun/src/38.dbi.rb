require 'dbi'

=begin
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

  # insert
  dbh.do("DROP TABLE IF EXISTS EMPLOYEE")
  dbh.do("CREATE TABLE EMPLOYEE (
         FIRST_NAME  CHAR(20) NOT NULL,
         LAST_NAME  CHAR(20),
         AGE INT,
         SEX CHAR(1),
         INCOME FLOAT )")
  dbh.do("INSERT INTO EMPLOYEE(FIRST_NAME,
                       LAST_NAME,
                       AGE,
               SEX,
               INCOME)
              VALUES ('Mac', 'Mohan', 20, 'M', 2000)")

  # batch
  sth = dbh.prepare("INSERT INTO EMPLOYEE(FIRST_NAME,
                       LAST_NAME,
                       AGE,
               SEX,
               INCOME)
                       VALUES (?, ?, ?, ?, ?)")
  sth.execute('John', 'Poul', 25, 'M', 2300)
  sth.execute('Zara', 'Ali', 17, 'F', 1000)
  sth.finish

  # read
  sth = dbh.prepare("SELECT * FROM EMPLOYEE
                            WHERE INCOME > ?")
  sth.execute(1000)

  sth.fetch do |row|
    printf "First Name: %s, Last Name : %sn", row[0], row[1]
    printf "Age: %d, Sex : %sn", row[2], row[3]
    printf "Salary :%d nn", row[4]
  end
  sth.finish

  # update
  sth = dbh.prepare("UPDATE EMPLOYEE SET AGE = AGE + 1
                            WHERE SEX = ?")
  sth.execute('M')
  sth.finish

  # delete
  sth = dbh.prepare("DELETE FROM EMPLOYEE
                            WHERE AGE > ?")
  sth.execute(20)
  sth.finish


  dbh.commit

rescue DBI::DatabaseError => e
  puts "An error occurred"
  puts "Error code:    #{e.err}"
  puts "Error message: #{e.errstr}"
ensure
  dbh.disconnect if dbh
end