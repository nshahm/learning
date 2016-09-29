package traits

trait EmployeeOperations {
  def create(id:Int, name:String):Int
  def delete(id:Int): Boolean
//  def isEqual(x:Any): Boolean 
}

class HR(val id:Int, val name:String) extends EmployeeOperations {
  
  
  def create(id:Int, name:String):Int = id
  def delete(id:Int): Boolean = {
    true
  }
  
//  def isEqual(x:Any):Boolean = x.isInstanceOf(HR) && x.asInstanceOf(HR).id =  
}

class Payroll(val id:Int, val name:String) extends EmployeeOperations {
  
  
  def create(id:Int, name:String):Int = id
  def delete(id:Int): Boolean = {
    true
  }
}



object TraitsInstance extends App {
  
  var hr = new HR(1, "G")
  var hr2 = hr
  var hr1 = new HR(2, "F")
  
  var payroll = new Payroll(2, "G")
  
  println (hr.isInstanceOf[HR])
  println (hr.asInstanceOf[EmployeeOperations])
}