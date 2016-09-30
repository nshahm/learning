package fileio

import java.io.PrintWriter
import java.io.File

object WriteFile extends App {
  val writer = new PrintWriter(new File("test.txt"))

  writer.write("Hello Scala")
  writer.close()
}