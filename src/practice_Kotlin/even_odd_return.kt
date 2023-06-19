package practice_Kotlin

import kotlin.math.pow

class even_odd_return {
}
fun main(){
    println(evenOddReturnSolution(10))
    println(evenOddReturnSolution02(10))
}
fun evenOddReturnSolution(n: Int): Int {
    var answer: Int = 0
    if (n % 2 == 0){
        for (i in 2 .. n step 2){
            answer += i * i
        }
    }else{
        for (i in 1 .. n step 2){
            answer += i
        }
    }
    return answer
}
fun evenOddReturnSolution02(n: Int) =
    if (n % 2 != 0){
        (1..n step 2).sum()
    }else{
        (2..n step 2).map { it.toDouble().pow(2.0) }.sum().toInt()
    }
