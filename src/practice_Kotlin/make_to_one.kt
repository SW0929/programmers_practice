package practice_Kotlin

class make_to_one {
}
fun main(){
    val array = intArrayOf(12,4,15,1,14)
    println(makeToOneSolution(array))
}
fun makeToOneSolution(num_list: IntArray): Int {
    var answer: Int = 0
    for (i in num_list.indices){
        while (num_list[i] != 1){
            if (num_list[i] % 2 == 0){
                num_list[i] /= 2
                answer++
            } else{
                num_list[i] = (num_list[i] - 1) / 2
                answer++
            }
        }
    }
    return answer
}