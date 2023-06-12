package practice_Kotlin

class last_elements {
}
fun main(){
    val intArray = intArrayOf(2,1,6)
    println(lastElementsSolution01(intArray).contentToString())
}
fun lastElementsSolution01(num_list: IntArray): IntArray {
    var answer = num_list
    answer = if (answer[answer.lastIndex] > answer[answer.lastIndex-1]){
        answer.plus(answer[answer.lastIndex] - answer[answer.lastIndex-1])
    }else{
        answer.plus(answer[answer.lastIndex] * 2)
    }
    return answer
}
fun lastElementsSolution02(numList: IntArray) =
    numList + if (numList[numList.lastIndex - 1] >= numList.last()) 2 * numList.last() else numList.last() - numList[numList.lastIndex - 1]