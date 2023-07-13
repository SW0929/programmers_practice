package practice_Kotlin

import java.util.Collections

class reverse_multi_string {
}
fun main(){
    val arr = arrayOf(intArrayOf(2,3), intArrayOf(0,7), intArrayOf(5,9), intArrayOf(6,10))
    println(reverseMultiStringSolution("rermgorpsam", arr))
}
fun reverseMultiStringSolution(my_string: String, queries: Array<IntArray>): String {
    var answer: String = my_string
    var reverse = ""
    for (i in queries.indices) {
        reverse = answer.slice(queries[i][0]..queries[i][1]).reversed()
        answer = answer.replaceRange(queries[i][0]..queries[i][1], reverse)
    }

    return answer
}