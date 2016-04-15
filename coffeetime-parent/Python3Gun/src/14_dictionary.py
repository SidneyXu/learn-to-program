# Define
peter = {'name': 'Peter', 'age': 18, 'height': 180}
jack = dict((('name', 'Peter'), ('age', 18), ('height', 180)))
jane = dict(name='Peter', age=18, height=180)

# Empty Dictionary
empty = {}

# Access Elements
# print(peter['not_exist'])     error
print(peter.get('not_exist'), -1)
print(peter.get('name'))

# Modify Elements
peter['sex'] = 'male'
peter.setdefault('no', 10)

# Delete Elements
peter.pop('age')
peter.popitem()
print(peter)
print()

# Length
print(len(peter))

# Traverse
keys = peter.keys()
values = peter.values()
entries = peter.items()
for (k, v) in entries:
    print(k, '=', v)
print()

# Exist
print('name' in peter)
print()

# Default Value
dict = peter.fromkeys(('foo', 'bar'), 'default')
print(dict)

# Shadow Copy
dict2 = dict.copy()
