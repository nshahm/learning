import sys

def doArithmetic(a, b, operation):
    if (operation == '+'):
        yield a + b
    elif (operation == '-'):
        yield a - b
    else:
        yield 'opertion not supported'

ret = doArithmetic(1,2, '+');
print (next(ret))

ret = doArithmetic(1,2, '-');
print (next(ret))

ret = doArithmetic(1,2, '*');
print (next(ret))


# yield will return a sequence of values using yield

import sys
def fibonacci(n): #generator function
    a, b, counter = 0, 1, 0
    while True:
        if (counter > n): 
            return
        yield a
        a, b = b, a + b
        counter += 1
f = fibonacci(5) #f is iterator object

while True:
   try:
      print (next(f), end=" ")
   except StopIteration:
      sys.exit()

