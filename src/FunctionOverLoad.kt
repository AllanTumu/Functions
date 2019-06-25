fun sum1(n1:Int,n2:Int):Int{
    return n1+n2
}

fun sum1(n1:Int,n2:Int,n3:Int):Int{
    return n1+n2+n3
}

fun sum1(n1:Int,n2:Int,n3:Int,n4:Int):Int{
    return n1+n2+n3+n4
}

fun main(args:Array<String>){
    println("Sum:" +sum1(10,20))
    println("Sum:" +sum1(10,20,30))
    println("Sum:" +sum1(10,20,30,40))
}
