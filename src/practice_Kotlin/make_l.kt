package practice_Kotlin

class make_l {
}
fun main(){
    println(makeLSolution("abcdevwxyz"))
    println(makeLSolution02("abcdevwxyz"))
}
fun makeLSolution(myString: String): String {
    var answer: String = ""
    myString.forEach {
        answer += if (it < 'l'){
            'l'
        }else
            it
    }
    return answer
}
fun makeLSolution02(myString: String) =
    myString.map { if (it.code <= 'l'.code) 'l' else it}.joinToString("")