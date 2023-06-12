package practice_Kotlin

class int_spiral {
}
fun main(){
    val n = 4
    println(intSpiralSolution(n))
}
fun intSpiralSolution(n: Int): Array<IntArray> {
    var answer: Array<IntArray> = arrayOf<IntArray>()
    var count = 1

    for (row in 0 until n){
        for (col in 0 until n){
            answer[row][col].plus(count)
            count++
        }
    }
    return answer
}