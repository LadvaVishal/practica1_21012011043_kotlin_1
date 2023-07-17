fun main()
{
    var a:Int=123
    println("Integer value:$a")
   var d:Double=a.toDouble()
    println("Double value(From integer):$d")

    var x:String="123"
    println("String value:$x")
    var y:Int=x.toInt()
    println("Integer value(From string):$y")

    var s:String="123"
    println("String value:$s")
    var c:Double=s.toDouble()
    println("Double value(From string):$c")
}