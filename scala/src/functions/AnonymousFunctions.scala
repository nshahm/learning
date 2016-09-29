package functions

// Anonymous functions are similar to ARROW functions in ES6 standards.
object AnonymousFunctions extends App {

  var sum = (a:Int, b:Int) => a + b
  
  var multiply = (a:Int, b:Int) => {
    a * b
  }
  
  var userDir = () => { System.getProperty("user.dir") }
  
  println (sum(1,2))
  println (multiply(2,2))
  
  println(userDir())

}