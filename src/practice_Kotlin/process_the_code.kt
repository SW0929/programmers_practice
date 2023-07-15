package practice_Kotlin

class process_the_code {
}
fun main(){
    println(processTheCodeSolution("abc1abc1abc"))
}
fun processTheCodeSolution(code: String): String {
    var answer: String = ""
    var mode = 0
    for (i in code.indices){
        if (mode == 0){
            if (code[i] != '1'){
                if (i % 2 == 0)
                    answer = answer.plus(code[i])
            }else{
                mode = 1
            }
        }else{
            if (code[i] != '1'){
                if (i % 2 == 1)
                    answer = answer.plus(code[i])
            }else{
                mode = 0
            }
        }
    }
    if (answer.isEmpty()){
        answer = "EMPTY"
    }
    return answer
}