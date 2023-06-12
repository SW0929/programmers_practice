package practice_Kotlin

class negative_number {
}
fun main(){
    val intArray = intArrayOf(12, 4, 15, 46, 38, -2, 15)
    println(negativeNumberSolution01(intArray))
}
fun negativeNumberSolution01(num_list: IntArray): Int {
    var answer: Int = -1
    val a: List<Int>
    a = num_list.filter { it < 0 }
    answer = if (a.isEmpty()){
        -1
    }else{
        num_list.indexOf(a[0])
    }
    return answer
}
fun negativeNumberSolution02(num_list: IntArray): Int {
    var answer: Int = -1

    for (i in num_list.indices){
        if (num_list[i] < 0){
            answer = i
            break
        }
    }
    return answer
}