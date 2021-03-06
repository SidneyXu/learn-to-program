nums = [1, 2, 3, 4, 5]

# For
for n in nums:
    print('for-in', str(n))
print()

for n in range(1, 10, 3):
    print('for-range', str(n))  # 1 4 7
print(list(range(5)))
print()

# While
i = 0
while i < 3:
    print('while', str(i))
    i += 1
else:
    print('end while', str(i))
print()

# Break and Pass
for i in range(1, 5):
    if i == 3:
        break
    print('break', str(i))
print()

for i in range(1, 5):
    if i == 3:
        pass
    print('next', str(i))

a = [i for i in range(100) if not (i % 2) and i % 3]
print(a)

b = {i: i % 2 == 0 for i in range(10)}
print(b)
