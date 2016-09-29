package collections

object SetOperations extends App {

  var set = Set(1, 2, 3, 4, 5, 5, 4, 3, 2, 1) // This has the duplicate values
  println(set) //Set(5, 1, 2, 3, 4) 

  // List operations
  println("head : " + set.head)
  println("tail : " + set.tail)
  println("isEmpty : " + set.isEmpty)

  println("Min : " + set.min)
  println("Max : " + set.max)

  // Concatenating two sets
  val fruit1 = Set("apples", "oranges", "pears")
  val fruit2 = Set("mangoes", "banana")

  // use two or more sets with ++ as operator
  var fruit = fruit1 ++ fruit2
  println("fruit1 ++ fruit2 : " + fruit)

  // use two sets with ++ as method
  fruit = fruit1.++(fruit2)
  println("fruit1.++(fruit2) : " + fruit)

  // Find the common values across two Sets
  val num1 = Set(5, 6, 9, 20, 30, 45)
  val num2 = Set(50, 60, 9, 20, 35, 55)

  // find common elements between two sets
  println("num1.&(num2) : " + num1.&(num2))
  println("num1.intersect(num2) : " + num1.intersect(num2))
  
  
  // Creating immutable Sets
  
  var immutableSet = scala.collection.Set(1,2,3)
  immutableSet = immutableSet.+(4, 5, 6) // Cannot added any data to it.
  println (immutableSet)
  
  var mutableSet = scala.collection.mutable.Set(1,2,3)
  mutableSet = mutableSet.+(4, 5, 6) // Cannot added any data to it.
  println (mutableSet)

  
  
  

}