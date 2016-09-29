package traits

object ValueClassUniversalTrait extends App {

  trait Printable extends Any {
    def print(): Unit = println(this)
  }
  class Wrapper(val underlying: Int) extends AnyVal with Printable

  val w = new Wrapper(3)
  w.print() // actually requires instantiating a Wrapper instance

  println (w.toString())
}