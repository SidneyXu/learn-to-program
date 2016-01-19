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

# XPath
langs = XPath.first(xmldoc, "//langs//language")
puts "langs:\n #{langs}"

# Print out all the movie types
XPath.each(langs, "//language") { |e| puts "type: #{e.text}" }

# Get an array of all of the movie formats.
names = XPath.match(xmldoc, "//language").map { |x| "language #{x.text}" }
puts names
