package basics

object LazyVal extends App {
  def hello() = {
    println("hello")
    15
  }
  
  val a = hello // hello prints
  lazy val b = hello // hello not printed as the lazy val will be calling the method only when accessing it
  
  
//  println (a)
//  println(b)
  
}