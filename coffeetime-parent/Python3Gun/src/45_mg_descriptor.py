class Descriptor:
    def __get__(self, instance, owner):
        print('get', instance, owner)

    def __set__(self, instance, value):
        print('set', instance, value)

    def __delete__(self, instance):
        print('delete', instance)


class Test:
    foo = Descriptor()


test = Test()
print(test.foo)  # get, None

test.foo = 'foo'  # set
print(test.foo)  # get, None
