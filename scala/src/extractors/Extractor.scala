package extractors

object Extract {

  def apply(x: Int) = x * 2;
  def unapply(x: Int): Option[Int] = if (x%2 == 0) Some(x / 2) else None
}

object Extractor extends App {
  val y = Extract(10); 
  println(y)

  y match {
    case Extract(x) => println (y+" is bigger two times than "+ x)
    case _         => println ("Not able to calculate")
  }
}


