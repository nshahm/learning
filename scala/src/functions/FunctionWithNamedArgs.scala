package functions

object FunctionWithNamedArgs extends App {
  def sum(a:Int, b:Int) = {
    a + b
  }
  
  // In this way it does not matter what order of parameter that are passing to function 
  println (sum (b = 4, a = 2))
}