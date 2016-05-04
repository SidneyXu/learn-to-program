import re

inputs = '99 bottles, 98 bottles'

# Regex
regex = r'[0-9]+\W'

# Matching
print(re.match(regex, inputs) is not None)

# Searching
regex = r'(\d{4})-(\d{2})'
result = re.search(regex, '2015-10')
print(result.string)
