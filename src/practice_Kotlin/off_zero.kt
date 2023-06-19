package practice_Kotlin

class off_zero {
}
fun main(){
    println(offZeroSolution("0010"))
    println(offZeroSolution02("0010"))
    println(offZeroSolution03("0010"))
}
fun offZeroSolution(n_str: String): String {
    var answer: String = ""
    if (n_str.startsWith('0')){
        for (i in n_str.indices){
            if (n_str[i] != '0') {
                answer = n_str.substring(i until n_str.length)
                break
            }
        }
    }else{
        answer = n_str
    }
    return answer
}

fun offZeroSolution02(n_str: String) = n_str.toInt().toString()

fun offZeroSolution03(n_str: String) = n_str.dropWhile { it == '0' }