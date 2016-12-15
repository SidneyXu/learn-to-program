import decimal

# Data Type
x = 2
y = 0.1
flag = False
c = 'a'
foo = 'foo'

print(type(x))
print(type(y))
print(type(flag))
print(type(True))
print(type(c))
print(type(foo))
print(type([]))
print(x.__class__)
print(1 == True)
print(True + True)

# Decimal
print(2 - 1.8)
print(decimal.Decimal('2') - decimal.Decimal('1.8'))

# Type Conversion
print(type(str(10)))
print(type(int('1')))

# Type Inference
if isinstance(foo, str):
    print('foo is a String')
