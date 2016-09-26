import os
import traceback
from LearningError import LearningError

# Excetion and show the traceback
def readFileNotExists():
    try:
        f = open(os.path.dirname(__file__) + '/this.txt', 'r')
        f.write('content')
    except IOError as ioe:
        # traceback.print_exception(ioe);
        traceback.print_stack()
        print (ioe.strerror)

        # print repr(traceback.extract_stack())
        # print repr(traceback.format_stack())
        # print ('IOError' , ioe.__traceback__.print)
    except Exception as e:
        print ('Not able to read file', e)

readFileNotExists()


# Show exceptiona and execute finally block
try:
    i = int('e')
except ValueError as ve:
    print (ve)
finally:
    print ('Not an number')




# Create user defined exceptions
try:
    raise LearningError("Created this LearningError for showing user defined exceptions")
except LearningError as le:
    print (le)
    