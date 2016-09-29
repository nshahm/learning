package traits


trait Vehicle {
  def wheels() : String
  def drive():String = "2WD" // Default implementation
}


class Car extends Vehicle {
  def wheels(): String = "4 wheeler"
  override def drive() : String  = "Two Wheel drive" // using override to overide the trait methods
}

class Truck extends Vehicle {
  def wheels(): String = "8 wheeler";
  override def drive(): String = "All Wheel drive"
}


object TraitsOperations extends App {
  var c:Vehicle = new Car()
  println(c.wheels())
  println(c.drive())
  
  var t:Vehicle = new Truck()
  println(t.wheels())
  println(t.drive())  
   
  
}


