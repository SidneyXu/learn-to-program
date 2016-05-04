# Calc between objects
# __add()__ => +
# __sub()__ => -
# __iadd()__ => +=
class RichInt(int):
    def __add__(self, other):
        print('add', self, other)
        return int.__add__(self, other)

    def __sub__(self, other):
        print('sub', self, other)
        return int(self) - int(other)

    def __iadd__(self, other):
        print('iadd', self, other)
        self = self.__add__(other)
        return self


a = RichInt(2)
b = RichInt(3)
print(a + b)
print(a - b)
a += 10
print(a)

# order
print(1 + a)
print(a + 1)
