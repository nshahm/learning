print ('python started')

# statement blocks
if True:
    print ('True')
    print ('Answer')
else:
    print ('False')
    print ("Another false")

# variables
line1 = 'line 1'
line2 = 'line 2'
line3 = 'line 3'

#multiline  statements on single line
comment = line1 + \
          line2 + \
          line3

print (comment);

single = 'hey'
doublequote = "hey"
multipleline = """ multiple line quote
that are allowed in python"""

print (single, doublequote, multipleline)


# Reading data from user
data = input ("Please enter some text")


# import sys package and write it to console
import sys;
sys.stdout.write('Hey - written thru sys package'  + data)

#multiple line single suites

a = 1; b = 2; c = 3;

if a == 1:
    print ('A is 1')
elif b == 2:
    print ('B is 2')
else :
    print ("Other")


