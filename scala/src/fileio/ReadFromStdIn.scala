package fileio

import scala.io.Source

object ReadFromStdIn extends App {
  print("Please enter your input : ")
//  val input = Source.fromInputStream(System.in);
//  val lines = input.getLines.collect _
  
  val line = scala.io.StdIn.readLine()
  println("Thanks, you just typed: " + line)
}