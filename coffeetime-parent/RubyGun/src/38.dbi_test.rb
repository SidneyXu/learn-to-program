require 'test/unit'
require 'dbi'

=begin
chmod go-w /Users/mrseasons/.nvm
1. brew install mysql
2. gem install dbi
3. gem install mysql
4. gem install dbd-mysql
=end

class DbiTest < Test::Unit::TestCase

  def setup
    @table='test'
    @user='root'
    @psw='tiger'
    @host='192.168.1.67'
    @dbh = DBI.connect("DBI:Mysql:#{@table}:#{@host}", @user, @psw)
  end

  def teardown
    @dbh.disconnect if @dbh
  end

  def test_connect
    begin
      row = @dbh.select_one('SELECT VERSION()')
      puts 'Server version: ' + row[0]
    rescue DBI::DatabaseError => e
      puts 'An error occurred'
      puts "Error code:    #{e.err}"
      puts "Error message: #{e.errstr}"
    ensure
      @dbh.disconnect if @dbh
    end

  end

  def test_insert
    @dbh.do('DROP TABLE IF EXISTS EMPLOYEE')
    @dbh.do('CREATE TABLE EMPLOYEE (
                ID INT AUTO_INCREMENT,
                FIRST_NAME  CHAR(20) NOT NULL,
                LAST_NAME  CHAR(20),
                AGE INT,
                SEX CHAR(1),
                INCOME FLOAT,
                PRIMARY KEY (ID) )')
    n=@dbh.do("INSERT INTO EMPLOYEE(
                FIRST_NAME,
                LAST_NAME,
                AGE,
                SEX,
                INCOME)
                VALUES ('Mac', 'Mohan', 20, 'M', 2000)")
    puts @dbh.func(:insert_id)
    assert_equal(1, n)
  end

  def test_batch_insert
    sth = @dbh.prepare('INSERT INTO EMPLOYEE(FIRST_NAME,
                            LAST_NAME,
                            AGE,
                            SEX,
                            INCOME)
                             VALUES (?, ?, ?, ?, ?)')
    sth.execute('John', 'Poul', 25, 'M', 2300)
    sth.execute('Zara', 'Ali', 17, 'F', 1000)
    sth.finish
  end

  def test_select
    sth = @dbh.prepare('SELECT * FROM EMPLOYEE
                            WHERE INCOME > ?')
    # pass arguments
    sth.execute(1000)

    sth.fetch do |row|
      printf 'First Name: %s, Last Name : %s, ', row['FIRST_NAME'], row['LAST_NAME']
      printf 'Age: %d, Sex : %s, ', row[3], row[4]
      printf "Salary :%d \n", row[5]
    end
    sth.finish
  end

  def test_update
    sth = @dbh.prepare('UPDATE EMPLOYEE SET AGE = AGE + 1
                            WHERE SEX = ?')
    sth.execute('M')
    sth.finish
  end

  def test_delete
    sth = @dbh.prepare('DELETE FROM EMPLOYEE
                            WHERE AGE > ?')
    sth.execute(20)
    sth.finish
  end

  def test_transaction01
    @dbh['AutoCommit'] = false
    begin
      @dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'John'")
      @dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'Zara'")
      @dbh.commit
    rescue
      puts 'transaction failed'
      @dbh.rollback
    end
    @dbh['AutoCommit'] = true
  end

  def test_transaction02
    @dbh['AutoCommit'] = false
    @dbh.transaction do |dbh|
      dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'John'")
      dbh.do("UPDATE EMPLOYEE SET AGE = AGE+1
                 WHERE FIRST_NAME = 'Zara'")
    end
    @dbh['AutoCommit'] = true
  end

  def test_autoclose_block
    DBI.connect("DBI:Mysql:#{@table}:#{@host}", @user, @psw) do |dbh|
        puts 'connected'
        dbh.execute('SELECT ID FROM EMPLOYEE') do |sth|
          puts 'Databases: ' + sth.fetch_all.size.to_s
        end

        dbh.prepare('SELECT ID FROM EMPLOYEE WHERE AGE > ?') do |sth|
          sth.execute(20)
          puts 'Databases: ' + sth.fetch_all.size.to_s
        end
    end
  end

  # Fake test
  def test_fail

    fail('Not implemented')
  end
end