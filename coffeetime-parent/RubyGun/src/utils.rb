puts 'load module'
COUNT = 10
module StrUtils
  COUNT = 20

  def sort_words(words)
    words.sort
  end

  def self.echo
    puts "#{COUNT} #{::COUNT}"
  end

end

