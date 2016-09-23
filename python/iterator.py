import sys

list=[1,2,3,4]
it = iter(list) # this builds an iterator object
print (next(it)) #prints next available element in iterator Iterator object can be traversed using regular for statement

for x in it:
   print (x, end=" ")
