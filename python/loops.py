a = 1
b = 5
c = 0
while a < b:
    c += 1
    a += 1
    print (c)
    # a  = a + 1


#infinite loop
# var = 1
# while var == 1 :  # This constructs an infinite loop
#    num = int(input("Enter a number  :"))
#    print ("You entered: ", num)

# print ("Good bye!")



# Using else in while loop
# count = 0
# while count < 5:
#    print (count, " is  less than 5")
#    count = count + 1
# else:
#    print (count, " is not less than 5")



#While single line statements
flag = 1

# while (flag): print ('Given flag is really true!')

# print ("Good bye!")


# range() Function
mylist = list(range(5))
print (mylist)

for v in list(range(10)): # traversee the range
    print (v)

for letter in 'Python':     # traversal of a string sequence
   print ('Current Letter :', letter)
print()

fruits = ['banana', 'apple',  'mango']
for fruit in fruits:        # traversal of List sequence
   print ('Current fruit :', fruit)    


# loop thru index
for index in range(len(fruits)):
    print (fruits[index])


# for loop with else
numbers=[11,33,55,39,55,75,37,21,23,41,13, 10]

for num in numbers:
    if num%2==0:
        print ('the list contains an even number')
        break
else:
    print ('the list doesnot contain even number')    

# break statement
#     Terminates the loop statement and transfers execution to the statement immediately following the loop.
# continue statement
#     Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating.
# pass statement
#     The pass statement in Python is used when a statement is required syntactically but you do not want any command or code to execute.