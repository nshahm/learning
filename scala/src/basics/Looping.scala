package basics

object Looping extends App {
  var a: Int = 1
  val b = 10
  println("for loop using to")
  // using to
  for (i <- 1 to 10) {
    println("i = " + i)
  }

  println("for loop using until")
  // using until
  for (j <- 1 until 10) {
    println("j = " + j)
  }

  println("for loop using to and until together")
  // Similar to Nested loop
  var z: Int = 0
  for (i <- 1 to 10; j <- 1 until 10) {
    z += 1
    println("z = %d, i = %d, j = %d", z, i, j)
  }

  println("for loop with collection")
  // for loop with collection
  var list: List[Int] = List(1, 2, 3, 4, 5)

  // for loop
  for (i <- list) {
    println(i)
  }

  println("for loop with collection using filters ")
  // for loop with filters added condition != 3
  for (
    i <- list if i != 3; if i == 5
  ) {
    println(i)
  }

  println("for loop using collection filters and yield a variable")
  var retVal = for { i <- list if i != 3; if i == 5 } yield i 

  for (z <- retVal) { println(z) }
}