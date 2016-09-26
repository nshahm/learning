listt = [1,2,3,4,5,6,7,8,9,0]

l = listt * 2;
print (l) # concantenate two times

print (l[-2]) # Index from reverse
tuplee = (1, 's')
listFromTuple = list(tuplee);
print (listFromTuple)


print (len(listt))
print (max(listt))
print (min(listt))


del listt[2];
print (listt)


# Compare lists
def cmp(a, b): # Not in python3 so defining one
    return (a > b) - (a < b) 

list1, list2 = [123, 'xyz'], [456, 'abc']

print (cmp(list1, list2))
print (cmp(list2, list1))
list3 = list2 + [786];
print (cmp(list2, list3))

list.append(obj)

# List related methods available
# Appends object obj to list
# 2	
# list.count(obj)


# Returns count of how many times obj occurs in list
# 3	
# list.extend(seq)


# Appends the contents of seq to list
# 4	
# list.index(obj)


# Returns the lowest index in list that obj appears
# 5	
# list.insert(index, obj)


# Inserts object obj into list at offset index
# 6	
# list.pop(obj=list[-1])


# Removes and returns last object or obj from list
# 7	
# list.remove(obj)


# Removes object obj from list
# 8	
# list.reverse()


# Reverses objects of list in place
# 9	
# list.sort([func])
