class Array:
    def __init__(self, *args):
        self.values = [x for x in args]
        self.access_count = {}.fromkeys(range(len(self.values)), 0)

    def __len__(self):
        return len(self.values)

    def __getitem__(self, item):
        self.access_count[item] += 1
        return self.values[item]


array = Array(1, 2, 3, 4, 5)
print(array[3])
print(array[3])
print(array[2])
print(array.access_count)
