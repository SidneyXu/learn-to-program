# List
## Define
empty = []
emptyList = list()
nums = [1, 2, 3]
print(nums)
print(type(nums))

## Length
print('length of list is', len(nums))

## Modify Elements
# empty[0] = 10     index out of range
empty.append(10)
nums.append(10)
nums.insert(0, 100)
nums.extend([-1, -2])
print(nums)
print()

## Access Elements
print('nums[0] is', nums[0])
print('nums[1] is', nums[-1])
print('nums[1:3] is', nums[1:3])
print()

## Delete Elements
nums.remove(10)  # not exist will throw an exception
nums.pop()
print(nums)

## Convention
nl = list((1, 2, 3))
sl = list('hello')
tl = list([1, 2, 3])
print(nl)
print(sl)
print(tl)
print()

# Operation
nums1 = [123]
nums2 = [234]
print(nums1 > nums2)  # false

nums1 = [345, 123]
nums2 = [300, 678]
print(nums1 > nums2)  # true

nums1 = [345, 123]
nums2 = [345, 678]
print(nums1 > nums2)  # false

# Connect
num3 = nums1 + nums2
print(num3)

# Other
print(nums1 * 3)  # [345, 123, 345, 123, 345, 123]
print(123 in num3)
print(123 not in num3)
print(num3.index(345))

## Slice
s = nums[1:3]
s.append(10)
print(s)  # [1, 2, 10]
print(nums)  # [-1, 1, 2, 3, 4]
print(nums[:3])
print(nums[:])  # a copy of original list
print()

# Set
set1 = {1, 2, 3, 4, 4}
set2 = set([1, 2, 3, 1, 2, 3])
print(set1)

set2.add(10)
print(set2)
print(1 in set1)

# Immute set
num3 = frozenset([1, 2, 3])

# Tuple
t1 = (1, 2, 3, 4)
print(t1)
print(t1[0])
print(t1[2:])

one = (1,)
two = 1,
print(type(one))
print(type(two))
