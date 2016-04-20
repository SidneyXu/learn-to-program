def str2int(n):
    try:
        result = int(n)
        if result == 1:
            raise Exception('something wrong')
    except (ArithmeticError, TypeError) as error:
        print(error)
        return 0
    except Exception as error:
        print('exception: ', error)
        return 67
    else:
        print('no exception')
    finally:
        print('finally')
        return 300


print(str2int(10))  # 300
print(str2int('10'))  # 300
print(str2int('1a0'))  # 300
print(str2int('a10'))  # 300
print(str2int('1'))  # 300
