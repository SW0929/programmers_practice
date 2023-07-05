package practice_Kotlin

class slice_list {
}
fun main(){
    val arr = intArrayOf(1,5,2)
    val arr2 = intArrayOf(1,2,3,4,5,6,7,8,9)
    println(sliceListSolution(4, arr,arr2).contentToString())
}
fun sliceListSolution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    answer = when(n){
        1 -> {
            num_list.slice(0 .. slicer[1]).toIntArray()
        }
        2 -> {
            num_list.slice(slicer[0] .. num_list.lastIndex).toIntArray()
        }
        3 -> {
            num_list.slice(slicer[0] .. slicer[1]).toIntArray()
        }
        else -> {
            num_list.slice(slicer[0] .. slicer[1] step slicer[2]).toIntArray()
        }
    }
    return answer
}

fun sliceListSolution02(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
    val (a,b,c) = slicer
    return when (n) {
        1 -> num_list.slice(0..b)
        2 -> num_list.slice(a..num_list.lastIndex)
        3 -> num_list.slice(a..b)
        else -> (a..b step c).map { num_list[it] }
    }.toIntArray()
}