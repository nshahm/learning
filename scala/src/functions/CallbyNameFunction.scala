package functions

object CallbyNameFunction extends App {
  
  def time(): Long = {
    System.nanoTime()
  }
  
  def showTime(t: => Long ) = {
    println (t)
  }
  
  showTime(time())
}