package basics

object Arrayz extends App {

  //  Declaring in different ways
  var number = new Array[Int](10)
  var number1: Array[Int] = new Array[Int](3)
  var number2 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

  number2.foreach { x => println(x) };

  var myList = Array(1.9, 2.9, 3.4, 3.5)

  // Print all the array elements
  for (x <- myList) {
    println(x)
  }

  // Summing all elements
  var total = 0.0;

  for (i <- 0 to (myList.length - 1)) {
    total += myList(i);
  }
  println("Total is " + total);

  // Finding the largest element
  var max = myList(0);

  for (i <- 1 to (myList.length - 1)) {
    if (myList(i) > max) max = myList(i);
  }

  println("Max is " + max);

  // Multi-dimensional arrays

  var multiDimensionArr = Array.ofDim[Int](3, 3)

  for (i <- 0 until 3) {
    for (j <- 0 until 3) {

      multiDimensionArr(i)(j) = j;
    }
  }

  for (i <- 0 until 3) {
    for (j <- 0 until 3) {

      print(multiDimensionArr(i)(j) + " ");
      if (j == 2) println()
    }
  }

  // concatenate the arrays
  var myList1 = Array(1.9, 2.9, 3.4, 3.5)
  var myList2 = Array(8.9, 7.9, 0.4, 1.5)

  var myList3 = myList1 ++ myList2
  

  // Print all the array elements
  for (x <- myList3) {
    println(x)
  }
  
  // creating Array with Range
  var myList4 = Array.range(10,30,1)
  myList4.foreach { v => println(v) }
}