MyVehicle = 'Four wheeler vehicle'
print ('Showing global scope', MyVehicle)

def show() :
    global MyVehicle # Accessing global variable and update it.
    MyVehicle = 'Car'
    print ('Show MyVehicle from ', MyVehicle)

def showAnother():
    MyVehicle = 'Truck'
    print ('Show MyVehicleAnother from ', MyVehicle)

if __name__ == '__main__':
    show()
    showAnother()
    print (MyVehicle)
