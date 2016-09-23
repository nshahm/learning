# variables
a = 1;

b = c = d = 2;

e = 1, 2, "John"

f, g, h = e

print (f)
print (g)
print (h)

del b # delete the reference of single or multiple variable
#print (b) # NameError: name 'b' is not defined


#string
name = "Shahm Nattarshah"
print (name[0])
print (name[2:5]) # substring
print (name[5:]) # substring only with start index

# list
list = [1,2,3,4,5,6,7,8,9,0]
tinylist = [1, "John"]
print (list)          # Prints complete list
print (list[0])       # Prints first element of the list
print (list[1:3])     # Prints elements starting from 2nd till 3rd 
print (list[2:])      # Prints elements starting from 3rd element
print (tinylist * 2) 
print (list + tinylist) # concatenated list

list.append(10) # Add anytime dynamically
print (list)


#tuple
# The main differences between lists and tuples are: Lists are enclosed in brackets ( [ ] ) 
# and their elements and size can be changed, while tuples are enclosed in parentheses ( ( ) ) 
# and cannot be updated. Tuples can be thought of as read-only lists

# Read only list we cannot update it
tuplee = ( 'abcd', 786 , 2.23, 'john', 70.2  )
tinytuple = (123, 'john')

print (tuplee)           # Prints complete tuple
print (tuplee[0])        # Prints first element of the tuple
print (tuplee[1:3])      # Prints elements starting from 2nd till 3rd 
print (tuplee[2:])       # Prints elements starting from 3rd element
print (tinytuple * 2)   # Prints tuple two times
print (tuplee + tinytuple) # Prints concatenated tuple

# tuple.append() no such method

#tuple[0] = 'efgh'; # TypeError: 'tuple' object does not support item assignment

# Dictionaries
# Dictionaries are enclosed by curly braces ({ }) and values can be assigned 
# and accessed using square braces ([]).
dict = {}
dict['one'] = "This is one"
dict[2]     = "This is two"

tinydict = {'name': 'john','code':6734, 'dept': 'sales'}

print (dict['one'])       # Prints value for 'one' key
print (dict[2])           # Prints value for 2 key
print (tinydict)          # Prints complete dictionary
print (tinydict.keys())   # Prints all the keys
print (tinydict.values()) # Prints all the values

# Cast variables to types

floatvar = 1.05
print (int(floatvar))

intvar = 2
print (float(intvar))
print (str(intvar))

expstr = (1, "shahm", "33", "pollachi")
print (repr(intvar))
print (eval(" intvar > 1")) # Evaluates the expression True

print (tuple("abcdefgh")) #('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
print (list(1,2,3,4,5))

