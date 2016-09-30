package exceptionhandling

import java.io.IOException
import java.io.FileNotFoundException
import java.io.FileReader

object BasicExceptions extends App {
  try {
    val f = new FileReader("input.txt")
  } catch {

    case ex: FileNotFoundException => {
      println("Missing file exception", ex)
      ex.printStackTrace()
    }

    case ex: IOException => {
      println("IO Exception")
    }
  } finally {
    println("BasicExceptions is done")
  }  
}