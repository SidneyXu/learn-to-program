__author__ = 'mrseasons'

triple = lambda x: x * 3
print(triple(2))

# Map
l = list(map(triple, [1, 2, 3]))
print(l)

# Filter
l = list(filter(None, [1, 0, 3, False, True]))
print(l)

l = list(filter(lambda x: x % 2, range(10)))
print(l)
