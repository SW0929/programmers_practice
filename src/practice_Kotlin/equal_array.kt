package practice_Kotlin

class equal_array {
}
fun main(){
    val array = intArrayOf(49, 13)
    val array2 = intArrayOf(70, 11, 2)
    println(equalArraySolution(array, array2))
    println(equalArraySolution02(array, array2))
}
fun equalArraySolution(arr1: IntArray, arr2: IntArray) =
    if (arr1.size > arr2.size){
        1
    }
    else if (arr1.size == arr2.size){
        if(arr1.sum() > arr2.sum())
            1
        else if (arr1.sum() == arr2.sum())
            0
        else
            -1
    }
        else{
        -1
    }

fun equalArraySolution02(arr1: IntArray, arr2: IntArray) =
    if (arr1.size == arr2.size){
        arr1.sum().compareTo(arr2.sum())
    }else
        arr1.size.compareTo(arr2.size)
/*
compareTo()
Int 형의 반환 값은 1, 0 , -1 총 3가지만 존재한다. 기준 값이 비교 값보다 더 클 경우 1을 반환하고
기준 값과 비교 값이 같은 경우 0을 반환하며 기준 값보다 비교 값이 더 큰 경우에는 -1을 반환한다.
 */