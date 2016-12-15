# Field Accessor
class Foo:
    def __init__(self):
        self.x = 10

    # When field not exist
    def __getattr__(self, item):
        print('getattr', item)

    # When field is accessed
    def __getattribute__(self, item):
        print('getattribute', item)
        return super().__getattribute__(item)

    def __setattr__(self, key, value):
        print('set', key, value)
        super().__setattr__(key, value)

    def __delattr__(self, item):
        print('del', item)
        super().__delattr__(item)


foo = Foo()  # set x

print(foo.x)  # getattribute x
print(getattr(foo, 'x', 'null'))  # getattribute x
print(getattr(foo, 'y', 'null'))  # getattribute y,getattr y

del foo.x  # del x