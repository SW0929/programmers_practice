package practice_Kotlin

class string_multi {
}
fun main(){
    println(stringMultiSolution("string", 3))
}
fun stringMultiSolution(my_string: String, k: Int) = my_string.repeat(k)