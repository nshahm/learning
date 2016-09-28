package basics

object BasicLiterals extends App {
  
    var a:Int = 1
    var b:String = "shahm"
    var c:String = """Multiline
      string literals
      that can be allowed in 
      scala"""
    
    var d:Boolean = true
    
    var mysymbol:Symbol = 'mysymbol
    var mysymbol1:Symbol = Symbol("Here is the symnbol withs space")
    
    println (mysymbol)
    println (mysymbol1)
}