import java.util.Scanner
//input
fun main(){
    print("Enter A: ")
    val a: Int = readln().toInt()
    print("Enter B: ")
    val b: Int =readln().toInt()


    val c = a + b
    println("Sum of $a and $b is $c")

}
//scanner
fun sum() {
    val sc = Scanner(System.`in`)
    print("Enter A: ")
    val a: Int = sc.nextInt()
    print("Enter B: ")
    val b: Int = sc.nextInt()


    val c = a + b
    println("Sum of $a and $b is $c")
}
