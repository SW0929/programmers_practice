package practice_Kotlin

class make_array_second {
}
fun main(){
    println(makeArraySecondSolution(5,555).contentToString())
}
fun makeArraySecondSolution(l: Int, r: Int): IntArray {
    return (l..r)
            // ex) 505 를 문자열로 변경하고 all 함수에서 char 형으로
            // 5,0,5 이런식으로 0과 5만 들어간 문자열인지 판단
        .filter { it.toString().all { c -> c == '0' || c == '5' } }
        .let { if (it.isEmpty()) intArrayOf(-1) else it.toIntArray() }
}