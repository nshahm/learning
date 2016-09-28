package objectoriented

import scala.Dynamic
/**
 * Describe public and private methods, protected too
 * make variable as private 
 */
class Vehicle(val name:String) extends Dynamic {
    private var vName:String = name
    private[objectoriented] var n:Int = 0 // Will be private to this package alone
    private [this] var a:String = "Initializing a private variable using this"
//    private[Car] var b:Int = 0

    def whoami():String = {
        "Vehicle"
    }

    protected def show() {
        println ("show()" +  vName);
        myPrivateMethod()
    }
    
    private def myPrivateMethod() {
        println ("My private method Invoked inside the show() method")
    }
}

class Car(override val name:String, val model:Int) 
    extends Vehicle(name)  {

    var modelYear = model

    def whoami1():String = {
        "Car"
    }

    def show1() {
       show()
        println ("Show - Car : " + name, " Model : ", modelYear)
    }
}

object Inher {
    def main (args : Array[String]) {

        val vehicle = new Vehicle("Truck")
        println (vehicle.whoami())
//        vehicle.show()

        val car = new Car("Honda Civic", 2007)
        car.show1()
        println (car.whoami1())

//        car.show()
        println (car.whoami())
    }
}
