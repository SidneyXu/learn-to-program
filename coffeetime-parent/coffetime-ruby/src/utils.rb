module StrUtil
  def self.break_words(stuff)
    # This function will break up words for us.
    words = stuff.split(' ')
    words
  end

  def sort_words(words)
    # Sorts the words.
    words.sort
  end
end