package practice_Kotlin

class sequence_queries_second {
}
fun main(){
    val arr = intArrayOf(0,1,2,4,3)
    val arr2 = arrayOf(intArrayOf(0,4,2), intArrayOf(0,3,2), intArrayOf(0,2,2))
    println(sequenceQueriesSecondSolution(arr,arr2).contentToString())
}
fun sequenceQueriesSecondSolution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer =  IntArray(queries.size)
    for (i in answer.indices){
        var a = arr.slice(queries[i][0]..queries[i][1])
        a = a.sorted()
        if (a.last() > queries[i][2]){
            for (j in a.indices){
                if (a[j] > queries[i][2]){
                    answer[i] = a[j]
                    break
                }
            }
        }else{
            answer[i] = -1
        }

    }

    return answer
}
fun sequenceQueriesSecondSolution02(arr: IntArray, queries: Array<IntArray>): IntArray {
    return queries.map { (s,e,k) ->
        arr.slice(s..e).filter { it > k }.minOrNull() ?: -1
        // ?: 는 Elvis operator 왼쪽 항이 null 인 경우 오른쪽 항(default) 값 준다
    }.toIntArray()
}