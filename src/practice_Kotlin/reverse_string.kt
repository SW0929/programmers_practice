package practice_Kotlin

class reverse_string {
}
fun main(){
    println(reverseStringSolution("Progra21Sremm3", 6, 12))
}
fun reverseStringSolution(my_string: String, s: Int, e: Int): String {
    var answer = StringBuilder()
    answer.append(my_string)

    answer.delete(s, e+1)

    var reverse = my_string.substring(s,e+1).reversed()
    answer.insert(s, reverse)



    return answer.toString()
}

fun reverseStringSolution02(myString: String, s: Int, e: Int) =
    myString.substring(0, s) + myString.substring(s..e).reversed() + myString.substring(e + 1, myString.length)
