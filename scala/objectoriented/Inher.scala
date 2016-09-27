class Vehicle(val name:String) {
    var vName:String = name

    def whoami():String = {
        return "Vehicle"
    }

    def show() {
        println ("show()" +  vName);
    }
}

class Car(override val name:String, val model:Int) 
    extends Vehicle(name) {

    var modelYear = model

    def whoami1():String = {
        "Car"
    }

    def show1() {
        println ("Show - Car : " + name, " Model : ", modelYear)
    }

}


object Inher {
    def main (args : Array[String]) {

        val vehicle = new Vehicle("Truck")
        println (vehicle.whoami())
        vehicle.show()

        val car = new Car("Honda Civic", 2007)
        car.show1()
        println (car.whoami1())

        car.show()
        println (car.whoami())
    }
}
