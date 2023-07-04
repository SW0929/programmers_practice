package practice_Kotlin

class appear_string {
}
fun main(){
    println(appearStringSolution("banana", "ana"))
}
fun appearStringSolution(myString: String, pat: String): Int {
    var answer: Int = 0
    for (i in 0 .. myString.length - pat.length){

        if (myString.substring(i, i + pat.length) == pat)
            answer++
    }
    return answer
}