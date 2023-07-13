package practice_Kotlin

class make_array_six {
}
fun main(){
    val intArray = intArrayOf(0,1,1,0)
    println(makeArraySixSolution(intArray).contentToString())
}
fun makeArraySixSolution(arr: IntArray): IntArray {
    var answer = mutableListOf<Int>()
    var i = 0
    for (j in arr.indices){
        if (answer.isEmpty() || answer.last() != arr[i]){
            answer.add(arr[i])
            i++
        }else {
            answer.removeLast()
            i++
        }
    }
    if (answer.isEmpty()){
        answer.add(-1)
    }
    return answer.toIntArray()
}