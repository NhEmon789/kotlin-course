//normal function
fun main(){
 val a:Int =10
    println("a= $a")
    sum(10,20)
    println(add(a))
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
