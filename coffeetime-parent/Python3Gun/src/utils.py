print('load module')

COUNT = 10


class StrUtils:
    COUNT = 20

    @staticmethod
    def sort_words(words):
        return sorted(words)

    @staticmethod
    def echo():
        print(COUNT, StrUtils.COUNT)

    @classmethod
    def cout(cls):
        print(cls)
        print(COUNT, StrUtils.COUNT)


# Test
if __name__ == '__main__':
    StrUtils.echo()
