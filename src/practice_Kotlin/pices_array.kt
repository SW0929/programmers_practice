package practice_Kotlin

class pices_array {
}
fun main(){
    val arr = intArrayOf(0,1,2,3,4,5)
    val arr2 = intArrayOf(4,1,2)
    println(picesArraySolution02(arr,arr2).contentToString())
}
fun picesArraySolution(arr: IntArray, query: IntArray): IntArray {
    var answer = arr.asList().toMutableList()
    for (i in query.indices){
        if (i % 2 == 0){
            for (j in answer.size-1 downTo 0){
                if (j == query[i]){
                    break
                }else{
                    answer.removeLast()
                }
            }
        }else{
            for (j in answer.indices){
                if (j == query[i]){
                    break
                }else{
                    answer.removeFirst()
                }
            }
        }
    }
    return answer.toIntArray()
}
fun picesArraySolution02(arr: IntArray, query: IntArray): IntArray {
    var start = 0
    var end = arr.lastIndex
    for(i in query.indices) {
        val index = start + query[i]
        println(index)
        if(i % 2 == 0) {
            end = index
        } else {
            start = index
        }
    }
    return arr.sliceArray(start..end)
}

