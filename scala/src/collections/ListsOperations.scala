package collections

object ListsOperation extends App {

  // List of Strings
  val fruit: List[String] = List("apples", "oranges", "pears")

  // List of Integers
  val nums: List[Int] = List(1, 2, 3, 4)

  // Empty List.
  val empty: List[Nothing] = List()

  // Two dimensional list
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1))

  var name = "shahm" :: ("nattarshah" :: ("ghazni" :: Nil)) // :: name it as cons
  println(name)

  // List operations
  println("head : " + name.head)
  println("tail : " + name.tail)
  println("isEmpty : " + name.isEmpty)

  // Concatenating the lsit
  var newlist = name.:::(nums).:::(fruit)
  println(newlist)

  var newlist1 = name ::: nums
  println(newlist1)

  var newlist2 = List.concat(name, fruit)
  println(newlist2)

  var flatMapList = nums.flatMap { x => List(x, x + 1) }
  println(flatMapList)

  // Create uniform Lists
  var fillList = List.fill(3)("blah")
  println(fillList)

  var fillList1 = List.fill(3, 3)("blah")
  println(fillList1)

  // Tabulating the list
  var tabList = List.tabulate(2)(f => f + 1)
  println(tabList)

  var tabList1 = List.tabulate(2, 2)(_ + _)
  println(tabList1)

  var reverseList = tabList1.reverse
  println(reverseList)

  println(name.::("sbros"))
  println(name.+:("new"))
  println(name.+("newstring"))

  println(name.apply(0))
  println(name.applyOrElse(6, "Not found"))
}