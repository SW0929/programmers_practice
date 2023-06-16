package practice_Kotlin

import java.util.StringTokenizer

class separate_space {
}
fun main(){
    println(separateSpaceSolution(" i    love  you").contentToString())
    println(separateSpaceSolution02(" i    love  you"))
    println(separateSpaceSolution03(" i    love  you").contentToString())
}
fun separateSpaceSolution(my_string: String): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    var ms = StringTokenizer(my_string)
    for (i in 0 until ms.countTokens()){
        answer = answer.plus(ms.nextToken())
    }
    return answer
}

fun separateSpaceSolution02(my_string: String): List<String> {
    //정규식 공백 제거
    return my_string.trim().split("\\s+".toRegex())
}

fun separateSpaceSolution03(my_string: String): Array<String> {
    return my_string.split(" ").filterNot { it.isBlank() }.toTypedArray()
}