# Define
def hello():
    return 'hello'


# Function Document
def add(x, y):
    """add two numbers"""
    return x + y


# Varargs
def sum(*n):
    result = 0
    for i in n:
        result += i
    return result


# Default Values
def say(name, word='hello'):
    print(name, ', ', word)


# Return Values
def triple(x, y, z):
    return x * 3, y * 3, z * 3


print(hello())
print(add.__doc__)
help(add)
print('sum(1,2,3) is', sum(1, 2, 3))
x, y, z = triple(1, 2, 3)
print(x, y, z)

# Keyword Values
print(say(word='how are you', name='Peter'))

# Global Parameters
num = 100
m = 200


def declare10():
    # print(num)    error
    num = 10
    print(m)


declare10()
print(num)  # 100


def declare5():
    global num
    num = 5


declare5()
print(num)  # 5


# Static Method / Class Method
class StrUtils:
    @staticmethod
    def sort_words(words):
        return sorted(words)

    @classmethod
    def cout(cls):
        print(cls)


print(StrUtils.sort_words([3, 2, 1]))
