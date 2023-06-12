package practice_Kotlin

class condition_change {
}
fun main(){
    val array = intArrayOf(1,2,3,100,99,98)
    println(conditionChangeSolution(array))
}
fun conditionChangeSolution(arr: IntArray) = arr.map {
    if (it >= 50 && it % 2 == 0)
        it / 2
    else if (it < 50 && it % 2 != 0)
        it * 2
    else
        it
}