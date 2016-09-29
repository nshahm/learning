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
  
  
  // Recursive functions
  
   def factorial(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * factorial(n - 1)
   }
  
   for (i <- 1 to 10)
     println( "Factorial of " + i + ": = " + factorial(i) )
  
}