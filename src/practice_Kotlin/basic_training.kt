package practice_Kotlin

class basic_training {
}
fun main() {
    print(basicTrainingSolution("ProgrammerS123", 11))
}



fun basicTrainingSolution(my_string: String, n: Int) = my_string.slice((my_string.length-n)until my_string.length)