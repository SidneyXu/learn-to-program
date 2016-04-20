import os

if not os.path.exists('files'):
    os.mkdir('files')

entries = os.listdir('files')
for entry in entries:
    print(entry)

print(os.path.isfile('files/test.txt'))

os.chdir('files')

file = open('test.txt', 'w', encoding='UTF-8')
file.write('foobar')
file.write('world\n')
file.write('bye')
file.close()

file = open('test.txt', 'r')
print('read:', file.read())

# Try-Resource
try:
    with open('test.txt', 'r') as f:
        for line in f:
            print(line)
except OSError:
    print('OSError occurs')
else:
    print('end read')

# Current Position
print(file.tell())

file.seek(0)
lines = list(file)
print(lines)

file.seek(0)
for line in file:
    print(line)
file.close()
