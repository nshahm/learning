package collections

object IteratorOperations extends App {
  var it = Iterator(1,2,3,4,5)
  var it1 = Iterator(1,2,3,4,5)
  var it2 = Iterator(1,2,3,4,5)
  var it3 = Iterator(1,2,3,4,5)
  
  
  println ("Lenght of iterator" + it.length)
  while (it3.hasNext) {
    println(it3.next)
  }
  
  println ("Max :" + it1.max)
  println ("Min :" + it2.min)
  
  // an iterator can read only one time if you try to do operation on same iterator
  //then will throw the exception

  //  it2.max //  java.lang.UnsupportedOperationException: empty.max
}