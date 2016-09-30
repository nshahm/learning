package regularexpressions

import scala.util.matching.Regex
import scala.util.matching.Regex.MatchIterator

object BasicRegEx extends App {

  //   Create Regex
  var pattern: Regex = "Scala".r
  val str = "Scala is Scalable and cool"

  pattern.findFirstIn(str) // Call method using . or using blank space
  println(pattern findFirstIn str) // or by using blank space

  //  Create the RegEx pattern and and apply againist string.
  val numPattern: Regex = "[0-9]+".r
  println(numPattern.findAllIn("shahm4567").next())

  // Trying to use iterator
  var matchIterator: MatchIterator = numPattern findAllIn ("1 2 3 4 5 6 7 8 9 0")
  if (matchIterator.hasNext) println(matchIterator.next())

  val pattern1 = "(S|s)cala".r

  println(pattern1 replaceFirstIn (str, "Java"))

  
//  
  val pattern2 = new Regex("abl[ae]\\d+")
  val str2 = "ablaw is able1 and cool"

  println((pattern2 findAllIn str2).mkString(",")) // mkString converts collection to String
  

}