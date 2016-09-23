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

