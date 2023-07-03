package practice_Kotlin

class sequence_queries_third {
}
fun main(){
    val arr = intArrayOf(0,1,2,3,4)
    val arr2 = arrayOf(intArrayOf(0,3), intArrayOf(1,2), intArrayOf(1,4))
    println(sequenceQueriesThirdSolution(arr, arr2).contentToString())
}
fun sequenceQueriesThirdSolution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in queries.indices){
        val a = queries[i][0]
        val b = queries[i][1]
        val c = arr[a]
        arr[a] = arr[b]
        arr[b] = c
    }
    return arr
}