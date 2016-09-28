package implicitclass

object ImplicitClass {
    
  implicit class StringUtilities(val str:String) {
    def toAlternateCase():String = {
      str + "toAlternateCase() method invoked"
    }
  }
  
  implicit class IntUtilities(val value: Int) {
    def checkZero(): Boolean = {
      value.==(0)
    }
  }
}