foo = 'bar'
BAR = 'bar'

foo = 123
BAR = 456

print(foo)
print(BAR)

one = 1
two = 2
one, two = 2, 1
print(one, two)

del one
print(one)

# Random
import random

print('random', random.randint(1, 10))
