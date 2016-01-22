require 'socket'

class Server
  def connect
    server = TCPServer.open(2000)
    loop {
      Thread.start(server.accept) do |client|
        client.puts(Time.now.ctime)
        client.puts 'Closing the connection. Bye!'
        client.close
      end
    }
  end
end

class Client
  def initialize(name)
    @name = name
  end

  def connect
    socket = TCPSocket.open('localhost', 2000)
    while (line = socket.gets)
      puts "#{@name} #{line.chop}"
    end
    socket.close
  end
end

Thread.new {
  server = Server.new
  server.connect
}
t1 = Thread.new {
  client01 = Client.new('client01')
  client01.connect
}
t2 =Thread.new {
  client02 = Client.new('client02')
  client02.connect
}

t1.join
t2.join