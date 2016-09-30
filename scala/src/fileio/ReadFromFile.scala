package fileio

import scala.io.Source
import java.net.URI

object ReadFromFile extends App {

  println("Following is the content read:")

  Source.fromInputStream(ReadFromFile.getClass().getResourceAsStream("hey.txt")).foreach {
    print
  }
//  var a = new URI("hey.txt").toString();
//  println (a)
//  Source.fromFile(a).foreach { x => println(x) }
}