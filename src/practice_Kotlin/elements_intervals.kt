package practice_Kotlin

class elements_intervals {

}
fun main(){
    val intArray = intArrayOf(4,2,6,1,7,6)
    println(elementsIntervalsSolution01(intArray, 2).contentToString())
    println(elementsIntervalsSolution02(intArray, 2))
}
fun elementsIntervalsSolution01(num_list: IntArray, n: Int): IntArray {
    var answer: IntArray = intArrayOf()

    for(i in num_list.indices step n){
        answer = answer.plus(num_list[i])
    }
    return answer
}

fun elementsIntervalsSolution02(num_list: IntArray, n: Int) = (num_list.indices step n).map { num_list[it] }