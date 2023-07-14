package practice_Kotlin

class random_k {
}
fun main(){
    val arr = intArrayOf(0,1,1,1,1)
    println(randomKSolution02(arr, 4).contentToString())
}
fun randomKSolution(arr: IntArray, k: Int): IntArray {
    var answer = intArrayOf()
    val a = arr.distinct()
    if (a.size >= k){
        answer = a.slice(0 until k).toIntArray()
    }else{
        answer = a.slice(a.indices).toIntArray()
        for (i in a.size until k){
            answer = answer.plus(-1)
        }
    }
    println((0 until k).map { it })
    println(arr.toSet().size)
    return answer
}

fun randomKSolution02(arr: IntArray, k: Int): IntArray {
   return (0 until k).map { if (it >= arr.distinct().size) -1 else arr.distinct()[it]}.toIntArray()
}