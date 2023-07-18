package practice_Kotlin

class save_slice_array {
}
fun main(){
    println(saveSliceArraySolution02("abc1Addfggg4556b",6).contentToString())
}
fun saveSliceArraySolution(my_str: String, n: Int): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    var i = 0
    while (true){
        if (i+n < my_str.length){
            answer = answer.plus(my_str.slice(i until i+n))
            i += n
        }else{
            answer = answer.plus(my_str.slice(i until my_str.length))
            break
        }
    }


    return answer
}
fun saveSliceArraySolution02(my_str: String, n: Int): Array<String> {
    val list = my_str.chunked(n)
    return list.toTypedArray()
}