package practice_Kotlin

class condition_change {
}
fun main(){
    val array = intArrayOf(1,2,3,100,99,98)
    println(solution003(array))
}
fun solution003(arr: IntArray) = arr.map {
    if (it >= 50 && it % 2 == 0)
        it / 2
    else if (it < 50 && it % 2 != 0)
        it * 2
    else
        it
}