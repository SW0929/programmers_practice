package practice_Kotlin

class negative_number {
}
fun main(){
    val intArray = intArrayOf(12, 4, 15, 46, 38, -2, 15)
    println(solution2(intArray))
}
fun solution2(num_list: IntArray): Int {
    var answer: Int = -1
    num_list.forEach {
        if (it < 0){
            answer = num_list.indexOf(it)
        }
    }
    return answer
}