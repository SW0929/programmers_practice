package practice_Kotlin

class count_char {
}
fun main(){
    println(countCharSolution("Programmers").contentToString())
}
fun countCharSolution(my_string: String): IntArray {
    val answer = IntArray(52)
    my_string.forEach {
        if (it.toInt() >= 97){
            answer[it.toInt() - 97 + 26]++
            println("97 ${it.toInt()}")
        }else{
            answer[it.toInt() - 65]++
            println("65 $it")
        }
    }
    return answer
}