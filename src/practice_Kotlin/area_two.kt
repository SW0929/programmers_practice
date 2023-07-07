package practice_Kotlin

class area_two {
}
fun main(){
    val arr = intArrayOf(1, 2, 1, 4, 5, 2, 9)
    println(areaTwoSolution02(arr).contentToString())
}
fun areaTwoSolution(arr: IntArray) =
    if (arr.contains(2)){
        arr.slice(arr.indexOf(2)..arr.lastIndexOf(2)).toIntArray()
    }else{
        val intArray = intArrayOf(-1)
        intArray
    }

fun areaTwoSolution02(arr: IntArray): IntArray {
    return if (arr.contains(2)) arr.copyOfRange(arr.indexOf(2), arr.lastIndexOf(2)+1) else intArrayOf(-1)
}