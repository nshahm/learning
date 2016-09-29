package collections

object MapOperations extends App {

  var empMap: Map[Int, String] = Map(1 -> "shahm", 2 -> "ghazni")
  println(empMap.get(1)) // Some(shahm) Option[T] = Some[T]
  println(empMap.get(2).get) // ghazni

  println(empMap.keys)
  println(empMap.values)

  // Concatenating Maps
  val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
  val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

  // use two or more Maps with ++ as operator
  var colors = colors1 ++ colors2
  println("colors1 ++ colors2 : " + colors) // Ignore the duplicate red

  // use two maps with ++ as method
  colors = colors1.++(colors2)
  println("colors1.++(colors2)) : " + colors) // Ignore the duplicate red
  
  colors.keys.foreach(f =>  println (colors(f)) )
  
  println (colors.max)
  println (colors.min)
  println (colors.size)
  println (colors.take(3))
  
  println (colors.toList)
  
  println (colors.toBuffer)
}