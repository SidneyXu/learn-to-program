def sayHello(name)
  puts "Hello, #{name}"
end

def sayGoodbye(name)
  puts "Goodbye, #{name}"
end

def doAction(action)
  if action == 'hello'
    :sayHello
  else
    :sayGoodbye
  end
end

action = method(:sayHello)
action.call('Peter')

method(doAction('other')).call('Jane')