package basics
import scala.util.control._

object LoopingBreak extends App {

  var list: List[Int] = List(1, 2, 3, 4, 5)
  
  // Define a break;
  // There is no continue as the condition inside for loop would allow that functionality
  var lbreak = new Breaks()

  lbreak.breakable {
    for (
      i <- list if i != 3
    ) {
      if (i == 5) { lbreak.break() }
      println(i)
    }
  }
     
   val numList1 = List(1,2,3,4,5);
      val numList2 = List(11,12,13);

      val outer = new Breaks;
      val inner = new Breaks;

      outer.breakable {
         for( a <- numList1){
            println( "Value of a: " + a );
            
            inner.breakable {
               for( b <- numList2){
                  println( "Value of b: " + b );
                  
                  if( b == 12 ){
                     inner.break;
                  }
               }
            } // inner breakable
         }
      } // outer breakable.
  
  
}
