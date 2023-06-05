package practice_Kotlin

class n_elements {

}
fun main(){
    val intArray = intArrayOf(2,1,6)
    println(solution2(intArray, 1).contentToString())
    println(solution3(intArray, 1).contentToString())
}


fun solution2(num_list: IntArray, n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    answer = num_list.slice(0 until n).toIntArray()
    return answer
}
fun solution3(num_list: IntArray, n: Int) = num_list.dropLast(num_list.size - n).toIntArray()