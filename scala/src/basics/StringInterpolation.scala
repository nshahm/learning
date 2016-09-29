package basics

object StringInterpolation extends App {
  
  // 's' interpolation
  
  val name = "Shahm"
  println(s"Hey, $name")
  
  // 's' interpolation with expression $ {1 + 1}
  println(s"1 + 1 = ${1 + 1}")
  
//  'f' interpolation
//   ‘f’ interpolator allows to create a formatted String, similar to printf in C language. 
//  While using ‘f’ interpolator, all variable references should be followed by the printf 
//  style format specifiers such as %d, %i, %f, etc
  val height = 1.9d
  println(f"$name%s is $height%2.2f meters tall") // With %s %d we can further format
  println(f"$name is $height meters tall") 
  
  
//  'raw' Interpolation
  println ("c:\\test") // See that the \ is taked as escape character and printed with single \
  println (raw"c:\\test") // No opertion performed on string and printed as is.
  
}