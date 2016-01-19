require 'rexml/document'

include REXML

# Dom Parse
# xmlfile = File.new("movies.xml")

xmlfile=<<ST
<langs type='current'>
  <language>Java</language>
  <language>Groovy</language>
  <language>Scala</language>
  <language>Kotlin</language>
</langs>
ST

xmldoc = Document.new(xmlfile)

root = xmldoc.root
puts "Root element : " + root.attributes["type"]

xmldoc.root.elements.each('language') { |e|
  puts e.text
}