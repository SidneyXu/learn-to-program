require 'rexml/document'
require 'rexml/streamlistener'
include REXML

class MyListener
  include REXML::StreamListener

  def tag_start(*args)
    puts "tag_start: #{args.map { |x| x.inspect }.join(', ')}"
  end

  def text(data)
    return if data =~ /^w*$/ # whitespace only
    abbrev = data[0..40] + (data.length > 40 ? "..." : "")
    puts "  text   :   #{abbrev.inspect}"
  end
end

xmlfile=<<ST
<langs type='current'>
  <language>Java</language>
  <language>Groovy</language>
  <language>Scala</language>
  <language>Kotlin</language>
</langs>
ST

list = MyListener.new
Document.parse_stream(xmlfile, list)