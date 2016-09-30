package patternmatching


// We can do matching for Array and all other types
object ListMatching extends App {
  var l = List(1, "Two", List(2, 3, 4), '$', 3)

  // looping list and matching
  l.foreach { f =>
    f match {
      case 1             => println("One")
      case "Two"         => println("Two")
      case List(2, 3, 4) => println("Sub list")
      case '$'           => println("Special character")
      case _             => println("Nothing matched")
    }
  }

  // Object Class matching 
  val alice = new Person("Alice", 25)
  val bob = new Person("Bob", 32)
  val charlie = new Person("Charlie", 32)

  for (person <- List(alice, bob, charlie)) {
    person match {
      case Person("Alice", 25) => println("Hi Alice!")
      case Person("Bob", 32)   => println("Hi Bob!")
      case Person(name, age) => println(
        "Age: " + age + " year, name: " + name + "?")
    }
  }

}

case class Person(name: String, age: Int)