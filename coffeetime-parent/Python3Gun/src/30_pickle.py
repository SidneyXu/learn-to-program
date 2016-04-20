import pickle

# wb means writing binary
f = open('files/students.pkl', 'wb')
item = [1, 2, 3, 4, 5, 6, 'hello', 'world', ['foo', 'bar']]
pickle.dump(item, f)
f.close()

f = open('files/students.pkl', 'rb')
item2 = pickle.load(f)
print(item2)
f.close()
