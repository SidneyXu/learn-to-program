# Literals
s = 'Hello World'
ds = "Hello World"

print('foo' + 'bar')

# Iterator
for c in s:
    print(c)

# Multiple Lines
text = """
    1, 2, 3 #{s}
    one, two, three
    "x, "y", "z"
"""
print(text)

print('c:\now')
print('c:\\now')
print(r'c:\now')

# Methods

# SubString
print('Hello World'[6:9])
print('Hello World'[:3])

# Format
print('{0} say {1}'.format('Marry', 'Hello'))
print('{name} say {msg}'.format(name='Marry', msg='Hello'))
print('{0:.2f}{1}'.format(1024.1024, 'GB'))

print('%s' % 97)
print('%c %c %c' % (65, 66, 67))
print('%10.2f' % 97.123)