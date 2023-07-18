package practice_Kotlin

class calculate_string {
}
fun main(){
    println(calculateStringSolution("3 + 4 - 21 + 2"))
}
fun calculateStringSolution(my_string: String): Int {

    var list = my_string.split(" ")
    var answer: Int = list[0].toInt()
    for (i in list.indices){
        if (list[i] == "+"){
            answer += list[i+1].toInt()
        }else if (list[i] == "-"){
            answer -= list[i+1].toInt()
        }
    }
    return answer
}