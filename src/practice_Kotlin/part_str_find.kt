package practice_Kotlin

class part_str_find {
}
fun main(){
    println(partStrFindSolution("AbCdEFG", "dE"))
}
fun partStrFindSolution(myString: String, pat: String) = myString.substringBeforeLast(pat) + pat