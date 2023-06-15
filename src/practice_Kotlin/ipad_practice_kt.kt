package practice_Kotlin

class ipad_practice_kt {
}
fun main(){

}
// 카운트 다운
/*
fun countDownSolution(start: Int, end: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in start downTo end){
            answer = answer.plus(i)
        }
        return answer
    }
fun countDownSolution02(start: Int, end: Int) = (end..start).toList().sortedDescending()

fun countDownSolution03(start: Int, end: Int): IntArray = (start downTo end).toList().toIntArray()
*/

// 배열의 원소만큼 추가하기
/*
fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in arr.indices){
            for(j in 0 until arr[i]){
                answer = answer.plus(arr[i])
            }
        }
        return answer
    }
fun solution02(arr: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        arr.forEach { a -> repeat(a) { answer.add(a) } }
				//repeat(n)은 특정 문자 n번 반복
        return answer.toIntArray()
    }
*/
