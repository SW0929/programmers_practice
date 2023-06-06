package practice_Kotlin

class count_up {
}
fun main(){
    println(solution4(3,10).contentToString())
}
fun solution3(start: Int, end: Int): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in start..end){
        answer = answer.plus(i)
    }
    return answer
}
fun solution4(start: Int, end: Int): IntArray = (start..end).toList().toIntArray()