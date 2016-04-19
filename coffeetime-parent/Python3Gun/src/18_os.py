import os

filename = 'files/test.txt'

# Path
print(os.path.basename(filename))  # test.tx
print(os.path.dirname(filename))  # files
print(os.path.isfile(filename))  # False
print(os.path.exists(filename))  # False
print(os.path.join('files', 'test.txt'))  # files/test.txt

# Workspace
print(os.getcwd())

# Change work space
os.chdir('..')

print(os.listdir())

# Single layers
os.mkdir('outputs/abc')
os.rmdir('outputs/abc')

# Multi layers
# Error if exists
os.makedirs('outputs/bar')
os.removedirs('outputs/bar')
