package practice_Kotlin

class sequence_query_four {
}
fun main(){
    val arr = intArrayOf(0,1,2,4,3)
    val arr2 = arrayOf(intArrayOf(0,4,1), intArrayOf(0,3,2), intArrayOf(0,3,3))
    println(sequenceQueryFourSolution(arr,arr2).contentToString())
}
fun sequenceQueryFourSolution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in queries.indices){
        for (j in queries[i][0] .. queries[i][1]){
            if (j % queries[i][2] == 0){
                arr[j]++
            }
        }
    }
    answer = arr
    return answer
}
fun sequenceQueryFourSolution02(arr: IntArray, queries: Array<IntArray>): IntArray = arr.apply {
    queries.forEach { (s,e,k) -> (s..e).filter { it % k == 0 }.forEach { arr[it]++ } }
}