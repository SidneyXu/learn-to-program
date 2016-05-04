# Nested Function
def outter():
    print('outter')

    def inner():
        print('inner')

    inner()


outter()

# Lambda
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


# Closure
def select(ele):
    def color(c):
        return '{element} change color {color}'.format(element=ele, color=c)

    return color


print(select('div')('red'))


# nonlocal
def fun1():
    x = 5

    def fun2():
        nonlocal x
        x *= 2
        return x

    return fun2()


print(fun1())
