package basics

// A closure is a function, whose return value depends on the value of one or more variables declared outside this function.
object Closures extends App {
  
  var question : String = "What is my name : "
  
  // This function is depends on external value of question, if the question is passed or defined inside it is a traditional enclosed functions.
  def question (name:String) : String = {
    question + name
  }
  
  println (question("shahm"))
  
  var factor = 3
  val multiplier = (i:Int) => i * factor
  
  println (multiplier(2))
}