package functions

import java.util.Date

object PartiallyAppliedFunctions extends App {
  
  def showDateWithMessage(date:Date, message:String) = println ( date.toString() + message)
  
  // Normal function invokation passing date to multiple functions
  val d = new Date
  
  showDateWithMessage(d, " first")
  showDateWithMessage(d, " second")
  showDateWithMessage(d, " third")
  
  
  // Partially applied functions 
  
  var partialApplied = showDateWithMessage(d, _ :String) // Use underscore to accept any value for a given parameter
  
  partialApplied(" partial first")
  partialApplied(" partial second")
  partialApplied(" partial third")
  
  
}