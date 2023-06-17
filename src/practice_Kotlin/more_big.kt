package practice_Kotlin

import kotlin.math.*

class more_big {
}
fun main(){
    println(moreBigSolution(9,91))
}
fun moreBigSolution(a: Int, b: Int): Int {
    var answer: Int = 0
    var string = ""
    var string2 = ""
    string = a.toString()+b.toString()
    string2 = b.toString()+a.toString()

    answer = if (string.toInt() >= string2.toInt())
        string.toInt()
    else
        string2.toInt()
    return answer
}

fun moreBigSolution02(a: Int, b: Int): Int {
    var answer: Int = 0
    var string = ""
    var string2 = ""
    string = a.toString()+b.toString()
    string2 = b.toString()+a.toString()

    answer = string.toInt().coerceAtLeast(string2.toInt())
    return answer
}
/*
coerceAtLeast()
호출된 객체가 특정 개체보다 큰지 아닌지를 확인해준다.
호출된 객체가 더 크면 객체 자체를 반환하고 그렇지 않으면 최소 객체를 반환한다.

coerceAtMost()
coerceAtLeast 랑 반대

coerceIn()
호출된 객체가 특정 최소값과 최대값 사이, 범위 내에 있는지 여부를 판단한다.
범위 내에 있으면 객체를 반환하고, 범위내에 없으면서 객체가 최소값보다 작으면 최소값을 반환하고,
범위내에 없으면서 최대값보다 크면 최대값을 반환한다.
 */

fun moreBigSolution03(a: Int, b: Int): Int {
    return max("$a$b".toInt(), "$b$a".toInt())
}