package practice_Kotlin

class convert_sequence_two {
}
fun main(){
    val arr = intArrayOf(1,2,3,100,99,98)
    println(convertSequenceTwoSolution(arr))
}
fun convertSequenceTwoSolution(arr: IntArray): Int {
    var answer: Int = 0
    var a = arr.copyOf()

    while (true){
        for (i in arr.indices){
            if (arr[i] >= 50 && arr[i] % 2 == 0){
                arr[i] /= 2
            }else if (arr[i] < 50 && arr[i] % 2 == 1){
                arr[i] = arr[i] * 2 + 1
            }else{
                continue
            }
        }

        if (a.contentEquals(arr)){
            break
        }else{
            answer++
            a = arr.copyOf()
        }

    }
    return answer
}