fun sum (v1:Int,v2:Int, v3:Int):Int{
    var sum = v1+v2+v3
    return sum
}
 fun sub (s1:Int, s2:Int):Int{
     var sub = s2 - s1
     return sub //expects to return a value
 }
//if u do not expect to return a value, use Unit
fun disp (i:Int=0):Unit{}

fun main (args:Array<String>){
    println(sub(10,20))
    println(sum(10,20,30))
    disp(10)
}