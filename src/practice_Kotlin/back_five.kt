package practice_Kotlin

class back_five {
}
fun main(){
    val intArray = intArrayOf(12,4,15,46,38,1,14,56,32,10)
    println(backFiveSolution(intArray).toString())
}
//뒤에서 5등 위로
fun backFiveSolution(num_list: IntArray) = num_list.sorted()
    .drop(5)