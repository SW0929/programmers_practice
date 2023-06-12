package practice_Kotlin

class find_Int {
}

fun main(){
    val intArray = intArrayOf(1,2,3,4,5)
    println(findIntSolution(intArray,3))
}

fun findIntSolution(num_list: IntArray, n: Int) = if (num_list.contains(n)) 1 else 0