package practice_Kotlin

import kotlin.math.max

class make_square {
}
fun main(){
    val intArray = arrayOf(intArrayOf(572, 22, 37), intArrayOf(287,726,384), intArrayOf(85,137,292), intArrayOf(487,13,876))
    val intArray2 = arrayOf(intArrayOf(572, 22, 37,2), intArrayOf(287,726,384,2))
    println(makeSquareSolution(intArray2).contentDeepToString())
}
fun makeSquareSolution(arr: Array<IntArray>): Array<IntArray> {
    val width = arr.first().size
    val height = arr.size
    val size = max(height, width)

    val array = Array(size){ IntArray(size) }

    for (i in 0 until height){
        for (j in 0 until width){
            array[i][j] = arr[i][j]
        }
    }
    return array
}