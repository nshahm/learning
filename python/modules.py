from vehicle import car, truck, van
from vehicle import globalvar

def display (text): 
    MyVehicle = 'Car'
    print ('Here is the text: ', text)
    return


def sum (a, b):
    c = a + b
    print ('Sum of %d and %d is %d' % (a , b, c))
    return c

# this will be executed only calling this file not when importing this module into another file.
if __name__ == '__main__':
    display('Executing __main__')
    sum(2,3)

# Run env.cmd to add this module to PYTHONPATH
car.whoami()
truck.whoami()
van.whoami()



