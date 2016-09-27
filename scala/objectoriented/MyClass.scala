class Employee(id:Int, name:String, age:Int) {
    var eId:Int = id
    var eName: String = name
    var eAge: Int = age

    def show() {
        println (eId, eName, eAge)
    }
}

object MyClass {
    def main(args:Array[String]) {
        var e = new Employee(1, "Shahm", 33)
        e.show()

        
    }
}