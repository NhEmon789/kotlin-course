//normal function
fun main(){
 val a:Int =10
    println("a= $a")
    sum(10,20)
    println(add(a))
    println(square(2))
    println(y(10,3))
    println(operate(10,30, op = {a,b->a+b}))
}
//parameter
fun sum(a:Int, b:Int){
    val c: Int=a+b
    println(c)
}
//return type

fun add(a:Int): Int{
    return a+a
}
fun square(x:Int):Int=x*x
//lamda function/anonymous function
val y={a:Int,b:Int ->a+b}
//higher order function
fun operate(a:Int, b:Int ,op:(Int,Int)-> Int):Int{
    return op(a,b)
}
