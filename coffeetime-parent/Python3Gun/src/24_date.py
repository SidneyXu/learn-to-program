import datetime
import time as timer

# Current Time
print(timer.ctime())
print(datetime.datetime.now())

# Timestamp
print(timer.time())

# Query Fields
t = datetime.datetime.now()
print(t.year)
print(t.month)
print(t.day)

# Format
print(timer.strftime('%Y-%m-%d %H:%M:%S'))
print(timer.strptime('2014-04-23', '%Y-%m-%d'))

# Calc
print(t - datetime.timedelta(seconds=-10))
