package functions

object HighOrderFunctions extends App {
  
//   f: (Int, Int)=> Int means a function that takes two param of int and return an Int
//  Though there are two sum method this will take only the sum with Int parameters
  def process (f: (Int, Int) => Int, a:Int, b:Int) : Int = {
    f(a, b)
  }
  
//  def sum[A, B](a:A, b:B) : Int = a + b
  
  def sum(a:String, b:String) : String  = a + b  
  
  def sum (a:Int, b:Int) = a+b
    print (process(sum, 1,2))
    
}