package functions

object Functions extends App {
  
  def funcWithNoReturn() : Unit = {
    println("function invoked")
  }
  
  def sum(a:Int, b:Int) : Int = {
    a + b
  }
  
  
  funcWithNoReturn()
  println(sum(1, 2))
  
  
  // function with variable args
   def sum(args : Int*):Int = {
    
    var z = 0
    for (i <- args) {
      z += i
    }
    z
  }
  
  println (sum (1,2,3,4,5))
  
}