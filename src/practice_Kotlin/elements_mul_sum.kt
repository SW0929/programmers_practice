package practice_Kotlin

import kotlin.math.pow

class elements_mul_sum {
}
fun main(){
    val intArray = intArrayOf(3,4,5,2,1)
    println(elementsMulSumSolution(intArray))
}

fun elementsMulSumSolution(num_list: IntArray): Int {
    var answer: Int = 0
    var mul = 1
    num_list.forEach { mul *= it }
    answer = if (num_list.sum().toDouble().pow(2.0) > mul){
            1
        }else{
            0
    }
    return answer
}