fun show(n1:Int):Int{
    println("n1:" +n1)
    return n1
}
fun show(n1:String):String{
    println("n1:" +n1)
    return n1
}

fun show(n1:Double):Double{
    println("n1:" +n1)
    return n1
}

fun main (args:Array<String>){
    show(10)
    show(10.5)
    show("allan")

}