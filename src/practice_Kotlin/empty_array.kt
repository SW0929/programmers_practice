package practice_Kotlin

import java.util.Stack

class empty_array {
}
fun main(){
    val arr = intArrayOf(3,2,4,1,3)
    val flag = booleanArrayOf(true,false,true,false,false)
    println(emptyArraySolution(arr, flag).contentToString())
}
fun emptyArraySolution(arr: IntArray, flag: BooleanArray): IntArray {

    var list = mutableListOf<Int>()

    for (i in flag.indices){
        if (flag[i]){
            repeat(arr[i] * 2){
                list.add(arr[i])
            }
        } else{
            repeat(arr[i]){
                list.removeLast()
            }
        }
    }
    return list.toIntArray()
}

fun emptyArraySolution02(arr: IntArray, flag: BooleanArray): Stack<Int> {
    val stack = Stack<Int>()

    for (i in arr.indices){
        for (j in 0 until arr[i] * if (flag[i]) 2 else 1){
            if (flag[i]) stack.push(arr[i]) else stack.pop()
        }
    }
    return stack
}