//grade calc
fun main() {
    val marks = readln().toInt()
    if (marks >100) {
        println("invalid marks")
    }else{
        val result = when {

            marks>=80->"A+"
            marks>=70->"A"
            marks>=60->"A-"
            marks>=50->"B"
            marks>=40->"C"
            marks>=0->"F"
            else -> "invalid marks"
        }
        println(result)
    }
grade()
}

fun grade(){
    print("Enter your grade:")
    val marks=readlnOrNull()?.toIntOrNull()

    val result=when(marks){
        in 80..100->"A+"
        in 70..79->"A"
        in 60..69->"A-"
        in 50..59->"B"
        in 40..49->"c"
        in 0..39->"f"
        else -> "invalid marks"
    }
    println(result)
}
