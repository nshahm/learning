package patternmatching

object BasicMatching extends App {
  
  def identifier (key :Int):String = key match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Other"
  }
  
  println(identifier(1))
  println(identifier(4)) // _ category is default
  println(identifier(3))
  println(identifier(2))
  
  
  
  
  def identifierAny(key:Any):String = key match {
    case 1 => "One"
    case "Two" => "Two matched"
    case 2.0 => "float"
    case 3.05 => "Double"
    case Symbol => "Symbod of 3"
    case _ => "Other"
//    case Employee => 
  }
  
  println(identifierAny(1));
  println(identifierAny("Two"));
  println(identifierAny(2.0));
  println(identifierAny(Symbol));
  println(identifierAny("Something else"));
  
  
  
  
}
//
//
//class Employee(var id:Int, var name:String {
//    def employeeDetails() :String = {
//      "id" + id + "name : " + name
//    }
//}
