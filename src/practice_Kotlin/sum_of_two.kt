package practice_Kotlin

class sum_of_two {
}
fun main(){
    println(sumOfTwoSolution("18446744073709551615", "287346502836570928366"))
}
fun sumOfTwoSolution(a: String, b: String) = (a.toBigInteger() + b.toBigInteger()).toString()

