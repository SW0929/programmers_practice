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

// 꼬리 문자열
/*
fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        str_list.forEach{
            if(!it.contains(ex)){
                answer+=it
            }
        }
        return answer
    }

fun solution(str_list: Array<String>, ex: String) = 
    str_list.filter{!it.contains(ex)}.joinToString("")
*/

//뒤에서 5등까지
/*
fun solution(num_list: IntArray) = num_list.sorted().slice(0..4)

fun solution(num_list: IntArray) = num_list.sorted().take(5)
*/

//홀수 vs 짝수
/*
fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var a = 0
        var b = 0
        for(i in num_list.indices){
            if(i % 2 == 0){
                a+= num_list[i]
            }else{
                b+= num_list[i]
            }
        }
        println(a)
        println(b)
        answer = if(a >= b) a else b
        return answer
}

fun solution(num_list: IntArray) = 
    max(
            num_list.filterIndexed { i, v -> i % 2 == 0}.sum(),
            num_list.filterIndexed { i, v -> i % 2 == 1}.sum()
)
*/

//할 일 목록
/*
fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(i in finished.indices){
            if(finished[i] == false){
                answer = answer.plus(todo_list[i])
            }
        }
        return answer
}

fun solution(todo_list: Array<String>, finished: BooleanArray) = todo_list.filterIndexed{i, v -> finished[i].not()}.toTypedArray()
*/

//순서 바꾸기
/*
fun solution(num_list: IntArray, n: Int) = 
    num_list.drop(n) + num_list.take(n)

fun solution(numList: IntArray, n: Int) = (numList + numList).copyOfRange(n, n + numList.size)

*/
