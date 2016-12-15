require 'open-uri'

open('https://www.github.com') do |http|
  html = http.read
  puts html
end