
# Single parameters
def sum (a,b):
    'Sum of two numbers' # doc for method
    return a+b;

s1 = sum(3,4)
print (s1)    

# multiple parameters
def sumAll(a, *var):
    'Sum of more numbers'
    s = a;
    for v in var :
        s += int(v)

    return s

s2 = sumAll(1,2,3,4,5)
print (s2)


# lamda functions
sumlamba = lambda a, b : sum(a,b)

print (sumlamba(3,2))