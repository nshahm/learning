package basics

object StringOperations extends App {
  
  var firstname = "Shahm"
  var lastname:String = " Nattarshah"
  
  println (firstname +  lastname)
  
  println (firstname.length())
  
  // Formatting strings
  var text = printf("Hello %s %s , how are you?", firstname, lastname)
  println (text)
  
  
}