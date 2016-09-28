package basics


//import scala.xml._ // import *
import scala.collection.mutable.HashMap // Import specific object
import scala.collection.immutable.{TreeMap, TreeSet} // Multiple import

object Welcome {
    def main(args:Array[String]): Unit = {
        println("Welcome to scala")
        
        var myVar = 5
        val (v1:Int, v2:String) = (40, "John") // Tuple syntax in python
        //var v3:Array[Int] = []{1,2,3,4,5}

        println (v1, v2)
    }

    def blah(text:String) = {
        println(text)
    }
}


// var v:String = """ Multi line String
// line 1
// line 2
// line 3"""


// println(v)

//Welcome().blah(text)

// w:Object = Welcome();
// w.blah('my text')

// Read about Apply dynamic later in examples