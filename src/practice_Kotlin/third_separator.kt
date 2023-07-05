package practice_Kotlin

import java.util.*
import kotlin.collections.ArrayList

class third_separator {
}
fun main(){
    println(thirdSeparatorSolution("cabab").contentToString())
}
fun thirdSeparatorSolution(myStr: String): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    var check = myStr
    check = check.replace("a", " ")
    check = check.replace("b", " ")
    check = check.replace("c", " ")
    var list = check.split(" ") as ArrayList<String>
    list.removeAll(listOf("", null).toSet())
    answer = list.toTypedArray()
    if (answer.isEmpty())
        answer = answer.plus("EMPTY")
    return answer
}
fun thirdSeparatorSolution02(myStr: String): List<String> {
    return myStr.split("[abc]+".toRegex()).filter(String::isNotEmpty).let { it.ifEmpty { listOf("EMPTY") } }
}