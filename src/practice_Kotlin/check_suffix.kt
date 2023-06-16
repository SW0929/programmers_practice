package practice_Kotlin

class check_suffix {

}
fun main(){
    println(checkSuffixSolution("banana", "ana"))
}
//my_string 과 is_suffix 가 같은 단어일 수 도 있음.
fun checkSuffixSolution(my_string: String, is_suffix: String): Int {
    var answer: Int = 0
    if(my_string.length > is_suffix.length){
        for(i in 1 until my_string.length){

            if(my_string.slice(i..my_string.lastIndex) == is_suffix){
                answer = 1
                break
            } else{
                answer = 0
            }
        }
    }else{
        answer = 0
    }

    return answer
}
fun checkSuffixSolution02(my_string: String, is_suffix: String) =
    if (my_string.endsWith(is_suffix)) 1 else 0

// startsWith : 특정 문자로 시작하는지 확인합니다
// endsWith : 특정 문자로 종료하는지 확인합니다