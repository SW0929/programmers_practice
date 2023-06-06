package practice_Kotlin

class count_up {
}
fun main(){
    println(solution3(3,10).contentToString())
}
fun solution3(start: Int, end: Int): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in start..end){
        answer = answer.plus(i)
    }
    return answer
}