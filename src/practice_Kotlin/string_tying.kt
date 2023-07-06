package practice_Kotlin

class string_tying {
}
fun main(){
    val array = arrayOf("a","bc","d","efg","hi", "b", "d", "k")
    println(stringTyingSolution(array))
}
fun stringTyingSolution(strArr: Array<String>): Int {
    var answer: Int = 0
    val a = IntArray(31)
    strArr.forEach {
        a[it.length]++
    }
    answer = a.maxOf { it }
    return answer
}
fun stringTyingSolution02(strArr: Array<String>): Int {
    return strArr.groupBy {
        it.length
    }.maxOf { it.value.size }
}