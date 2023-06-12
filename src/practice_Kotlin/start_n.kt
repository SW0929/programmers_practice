package practice_Kotlin

class start_n {
}
fun main(){
    val array = intArrayOf(2,1,6)
    println(startNSolution01(array, 3).contentToString())
    println(startNSolution01(array, 3).contentToString())
}
fun startNSolution01(num_list: IntArray, n: Int): IntArray {
    var answer = num_list.slice(n-1 until  num_list.size)
    return answer.toIntArray()
}
fun startNSolution02(num_list: IntArray, n: Int) = num_list.copyOfRange(n - 1, num_list.size)