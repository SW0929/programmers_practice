package practice_Kotlin

class delete_array_elements {
}
fun main(){
    val array = intArrayOf(293, 1000, 395, 678, 94)
    val array2 = intArrayOf(94, 777, 104, 1000, 1, 12)
    println(deleteArrayElementsSolution(array, array2))
}
fun deleteArrayElementsSolution(arr: IntArray, delete_list: IntArray) = arr.filter { !delete_list.contains(it) }.toIntArray()