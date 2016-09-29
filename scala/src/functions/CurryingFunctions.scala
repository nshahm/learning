package functions


object CurryingFunctions extends App{
  
  // V1 
  def sum(a:Int, b:Int): Int = a +b
  
  // V2  the exissting method will still work and also add new parameter to sum
  def sumCurried(a:Int, b:Int) = (c:Int) => {
    a + b + c
  }
  
  println (sum (1, 2))
  
  println (sumCurried (1,2)(3))
  
  
//  var sumCurriedAnonymous = Function.uncurried(sumCurried _)
////  Function.curried
  
}