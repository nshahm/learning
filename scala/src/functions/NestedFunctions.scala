package functions

// This nested function is used like defining a variable in method scope , so as functions.
// When that specified function is not used anywhere and used in a recirsive manner then use this way
// the memory of the function declaration will be GC after the call. 
object NestedFunctions extends App {
  
   def factorial(i: Int): Int = {
      def fact(i: Int, accumulator: Int): Int = {
         if (i <= 1)
            accumulator
         else
            fact(i - 1, i * accumulator)
      }
      fact(i, 1)
   }
   
   println (factorial(4))
}