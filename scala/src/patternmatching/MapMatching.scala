package patternmatching

object MapMatching extends App {
  var nameMap: Map[Int, Any] = Map(1 -> "shahm", 2 -> "Ghazni", 4 -> Map(3 -> "s", 4 -> "blah"))

  nameMap.foreach(f => f match {
    case _: Map[_, _]        => println("Map[1]")
    case _: Map[Int, String] => println("Map [Int]") // Not Advisable as at runtime it will be not able to find specific types
    case _: (_, v)           => println(nameMap)
    case _                   => println("No map found")
  })

//  println(nameMap(1, ""))
}