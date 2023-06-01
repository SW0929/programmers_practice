package practice_Kotlin

class basic_training {
}
fun main() {
    print(solution("ProgrammerS123", 11))
}

fun solution(my_string: String, n: Int) = my_string.slice((my_string.length-n)until my_string.length)