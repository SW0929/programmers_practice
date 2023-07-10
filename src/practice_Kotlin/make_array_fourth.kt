package practice_Kotlin

class make_array_fourth {
}
fun main(){
    val arr = intArrayOf(1,4,2,5,3)
    println(makeArrayFourthSolution(arr).contentToString())
}

fun makeArrayFourthSolution(arr: IntArray): IntArray {
    var stk = mutableListOf<Int>()
    var i = 0
    while (i < arr.size){
        if (stk.isEmpty()){
            stk.add(arr[i])
            i++
        }else{
            if (stk.last() < arr[i]){
                stk.add(arr[i])
                i++
            }else{
                stk.removeLast()
            }
        }
    }

    return stk.toIntArray()
}