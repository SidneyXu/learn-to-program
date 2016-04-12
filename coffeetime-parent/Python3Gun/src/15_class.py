class Person:
    sex = 'male'
    count = 0

    __private_name = 'private name'

    def __init__(self, name):
        self.name = name
        self.weight = 67
        self.age = 0

    def show(self):
        return "name=" + self.name + ",age=" + str(self.age)

    def say(self, msg):
        print(msg)

    def setAge(self, a):
        self.age = a

    def getAge(self):
        return self.age


# Object
p = Person('Peter')
p.setAge(10)
print(p.getAge())
print(p.sex)
print(p.show())

# Access private field by obj._classNameFieldName
print(p._Person__private_name)

p1 = Person('Jack')
p1.count = 10
p2 = Person('Tina')

# Class Object
Person.count = 100
print('p1=', str(p1.count))
print('p2=', str(p2.count))

# Inspect
print(p1.__dict__)
print(Person.__dict__)
