package collections

object TupleOperations extends App {
  
  // Tuple# is the number of element inside a single tuple. Currently the max is 22
  var tup = Tuple2(1, "shahm");
  println (tup)
  
  var tup4 = Tuple4(1,2,3,4)
  println(tup4)
  
  var tup22 = Tuple22(1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16,17,18,19,20,21,22)
  println(tup22)
  
//  var tup23 = Tuple23(1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16,17,18,19,20,21,22)
//  println(tup23) // Error not finding Tuple23
  
  // Accessing tuple based on its index.
  
  println (tup._1, tup._2)
  
  tup.productIterator.foreach { x => println(x) }
  
  println (tup.swap)
  
  println (tup.toString())
}