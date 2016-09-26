class Base:
    def __init__(self):
        print ('Calling parent constructor')
    def show(self):
        print ('Invoked from base class - ' , self.__class__.__name__)


class Derived(Base):
    def __init__(self):
        print ('Calling child constructor')    

    def display(self):
        print ('Invoded from derived class- ', self.__class__.__name__)

    def show(self):
        print ('Overriding method from derived class-', self.__class__.__name__)

# Base class
b = Base()
b.show()

# Derived class

d = Derived()
d.display()
d.show()


class DerivedAnother:
    def __init__(self):
        print ('Constructor invoked')

    def project(self):
        print ('Project method invoked in DerivedAnother')

class Inher(Base, Derived):
    def __init__(self):
        print('Calling Inher constructor')

    def show(self):
        print ('Calling inher show()')

i = Inher()
i.show()
i.display()