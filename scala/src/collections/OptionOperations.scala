package collections

object OptionOperations extends App {

  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

  println("capitals.get( \"France\" ) : " + capitals.get("France"))
  println("capitals.get( \"India\" ) : " + capitals.get("India"))
  
  def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
  }
  
  println (show(capitals.get("France")))
  println (show(capitals.get("India")))
  println (capitals.getOrElse("India", "Not found"))
}