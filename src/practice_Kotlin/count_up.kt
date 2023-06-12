package practice_Kotlin

class count_up {
}
fun main(){
    println(countUpSolution01(3,10).contentToString())
}
fun countUpSolution01(start: Int, end: Int): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in start..end){
        answer = answer.plus(i)
    }
    return answer
}
fun countUpSolution02(start: Int, end: Int): IntArray = (start..end).toList().toIntArray()