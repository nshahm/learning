tup1 = (); # empty tuple
tup2 = (1,) # the comma is required even if one value is present 

# Creating a tuple 
tup1 = ('physics', 'chemistry', 1997, 2000)
tup2 = (1, 2, 3, 4, 5, 6, 7 )

print ("tup1[0]: ", tup1[0])
print ("tup2[1:5]: ", tup2[1:5])


#Updating a tuple
tup1 = (12, 34.56)
tup4 = ('abc', 'xyz')

# Following action is not valid for tuples
# tup1[0] = 100;

# So let's create a new tuple as follows
tup3 = tup1 + tup4
print (tup3)

# deleting a tuple
# tup = ('physics', 'chemistry', 1997, 2000);

# print (tup)
# del tup;
# print "After deleting tup : "
# print tup


print (len(tup3))
print (max(tup2))
print (min(tup2))


