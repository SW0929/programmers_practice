package practice_Kotlin

class string_condition {
}
fun main(){
    println(stringConditionSolution("<", "=", 20, 50))
}
fun stringConditionSolution(ineq: String, eq: String, n: Int, m: Int): Int {
    var answer: Int = 0
    answer = if (eq == "="){
        if (ineq == "<"){
            if (n <= m) 1 else 0
        }else
            if (n >= m) 1 else 0
    }else{
        if (ineq == "<"){
            if (n < m) 1 else 0
        }else
            if (n > m) 1 else 0
    }
    return answer
}