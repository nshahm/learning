# bitwise operators
# a = bin(60)

# b = bin(13)

# print (a&b)
# print (a|b)

#Logical Membership operators
a = 10
b = 20
list = [1, 2, 3, 4, 5 ]

if ( a in list ):
   print ("Line 1 - a is available in the given list")
else:
   print ("Line 1 - a is not available in the given list")

if ( b not in list ):
   print ("Line 2 - b is not available in the given list")
else:
   print ("Line 2 - b is available in the given list")

c=b/a
if ( c in list ):
   print ("Line 3 - a is available in the given list")
else:
   print ("Line 3 - a is not available in the given list")

# Identity operators
# Identity operators compare the memory locations of two objects

a = 20
b = 20
print ('Line 1','a=',a,':',id(a), 'b=',b,':',id(b))

if ( a is b ):
   print ("Line 2 - a and b have same identity")
else:
   print ("Line 2 - a and b do not have same identity")

if ( id(a) == id(b) ):
   print ("Line 3 - a and b have same identity")
else:
   print ("Line 3 - a and b do not have same identity")

b = 30
print ('Line 4','a=',a,':',id(a), 'b=',b,':',id(b))

if ( a is not b ):
   print ("Line 5 - a and b do not have same identity")
else:
   print ("Line 5 - a and b have same identity")


   #
#    Operator	Description
# **	    Exponentiation (raise to the power)
# ~ + -	    Ccomplement, unary plus and minus (method names for the last two are +@ and -@)
# * / % //	Multiply, divide, modulo and floor division
# + -	        Addition and subtraction
# >> <<	    Right and left bitwise shift
# &	Bitwise 'AND'	
# ^ |	Bitwise exclusive `OR' and regular `OR'
# <= < > >=	Comparison operators
# <> == !=	Equality operators
# = %= /= //= -= += *= **=	Assignment operators
# is is not	Identity operators
# in not in	Membership operators
# not or and	Logical operators
