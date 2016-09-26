class Employee:
    'Documentation for this class'
    __totalEmployees = 0 # private variable for each instance

    # constructor and initialization
    def __init__(self, id, name, salary):
        self.id = id;
        self.name = name;
        self.salary = salary;
        self.__totalEmployees += 1;

    def log(self):
        print ('Id: %d, Name: %s, Salary : %f' % (self.id, self.name, self.salary))
    
    def showCount(self):
        print ('Total Employee instance created ', self.__totalEmployees)

    def __del__(self):
        cn = self.__class__.__name__
        print (cn + 'destroyed')

    def __str__(self):
        return 'Id: %d, Name: %s, Salary : %f' % (self.id, self.name, self.salary)

    def __cmp__(self, other):
        return self.id == other.id 


emp1 = Employee(1,'Shahm', 20000.00)
emp1.log()


emp1.salary = 25000.00 # Updating property on class

emp1.log()
emp1.showCount()


emp2 = Employee(1,'Ghazni', 30000.00)
emp2.log()
emp2.showCount()

print ('hasattr(emp1, \'salary\')', hasattr(emp1, 'salary'))    # Returns true if 'salary' attribute exists
print ('getattr(emp1, \'salary\')', getattr(emp1, 'salary'))    # Returns value of 'salary' attribute
setattr(emp1, 'salary', 7000.00) # Set attribute 'salary' at 7000
emp1.log()

print ('delattr(emp1, \'salary\') ')
delattr(emp1, 'salary')    # Delete attribute 'salary'
print ('hasattr(emp1, \'salary\')', hasattr(emp1, 'salary'))

# Built in class attributes
print ("Employee.__doc__:", Employee.__doc__,)
print ("Employee.__name__:", Employee.__name__)
print ("Employee.__module__:", Employee.__module__)
print ("Employee.__bases__:", Employee.__bases__)
print ("Employee.__dict__:", Employee.__dict__ )

# str(emp1)
# print ("str(emp1)", str(emp1))

#Comparing two objects
cmp(emp1, emp2)

print (id(emp1), id(emp2)) # display the reference location
del emp1 # when deleted it deleted two instance

