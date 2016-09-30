package extractors

class Employee(var id: Int, var name: String)

class Person(var id: Int, var firstname: String, var lastname: String)

// Extractor should implement unapply method. It is easy to use on pattern-matching
object Employee {
  def unapply(emp: Employee): Option[(Int, String)] = Some((emp.id, emp.name))
}

object EmployeeExtractor extends App {
  
  var emp = new Employee(1, "Shahm")
  var emp1 = new Employee(2, "Ghazni")

  for (a <- List(emp, emp1)) a match {
    case Employee(b) => println (b)
    case _ => println (a)
////    case a: Employee(_) => println(EmployeeExtractor.unapply(a));
//    case _           => println(a)
  }
}