package practice_Kotlin

class n_elements {

}
fun main(){
    val intArray = intArrayOf(2,1,6)
    println(nElementsSolution01(intArray, 1).contentToString())
    println(nElementsSolution01(intArray, 1).contentToString())
}


fun nElementsSolution01(num_list: IntArray, n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    answer = num_list.slice(0 until n).toIntArray()
    return answer
}
fun nElementsSolution02(num_list: IntArray, n: Int) = num_list.dropLast(num_list.size - n).toIntArray()