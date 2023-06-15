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

// 배열의 길이에 따라 다른 연산하기
/*
fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        if(arr.size % 2 != 0){
            for(i in 0..arr.size step 2){
                arr[i] += n
            }
        }else{
            for(i in 1..arr.size step 2){
                arr[i] += n
            }
        }
        return arr
    }
// arr 길이가 짝수(홀수)일때 인덱스 홀수(짝수)의 값에 넣기 때문에 가능함
fun solution(arr: IntArray, n: Int) = arr.mapIndexed { index, num ->
        num + if ((arr.size + index) % 2 == 1) n else 0
    }
*/