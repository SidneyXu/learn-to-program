# Iterator
str = 'foo'
it = iter(str)
print(next(it))
print(next(it))
print(next(it))

# print(next(it))   StopIteration

# Custom
class Fibs:
    def __init__(self, n=10):
        self.a = 0
        self.b = 1
        self.n = n

    def __iter__(self):
        return self

    def __next__(self):
        self.a, self.b = self.b, self.a + self.b
        if self.a > self.n:
            raise StopIteration
        return self.a


f = Fibs(20)
for e in f:
    print('fib', e)
print()

it = iter(Fibs(20))
print(next(it))
