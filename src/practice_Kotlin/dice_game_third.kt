package practice_Kotlin

import kotlin.math.abs
import kotlin.math.pow

class dice_game_third {
}
fun main(){
    println(diceGameThirdSolution(1,2,2,3))
}
fun diceGameThirdSolution(a: Int, b: Int, c: Int, d: Int): Int {
    var answer: Int = 1
    val array = intArrayOf(a ,b ,c ,d)

    when(array.distinct().size){
        1 -> {
            answer = array[0] * 1111
        }
        2 -> {
            val sa = array.sorted()

            answer = if (sa[0] == sa[2] || sa[1] == sa[3]){
                if (sa[0] == sa[2]){
                    (10 * sa.first() + sa.last().toDouble()).pow(2).toInt()
                }else{
                    println(10 * sa.last() + sa.first())
                    (10 * sa.last() + sa.first().toDouble()).pow(2).toInt()
                }
            }else{
                (sa[2] + sa[1]) * abs(sa[2] - sa[1])
            }
        }
        3 -> {
            var list = array.asList().toMutableList()
            var chek = 0

            for (i in 0..2){
                for (j in i+1 until 4){
                    if (list[i] == list[j]) {
                        list[i] = 1
                        list[j] = 1
                        chek = 1
                        break
                    }
                }
                if (chek == 1)
                    break
            }
            list.forEach{
                 answer *= it
            }
        }
        4 -> {
            answer = array.minOf { it }
        }
    }


    return answer
}
fun diceGameThirdSolution02(a: Int, b: Int, c: Int, d: Int): Int {
    var answer: Int = 0
    var arr = IntArray(7){0}
    arr[a]++
    arr[b]++
    arr[c]++
    arr[d]++
    var max = arr.maxOrNull()

    when(max){

        4 -> answer = 1111*a
        3 -> {
            val p = arr.indexOf(3)
            val q = arr.indexOf(1)
            answer = ((10*p)+q) * ((10*p)+q)
        }

        2 -> {
            var p = 0
            var q = 0
            for(i in 1 .. arr.size-1){
                if(arr[i] == 2){
                    if(p == 0) p = i
                    else q = i
                }
            }
            if(q != 0) answer = (p+q) * abs(p-q)

            else {
                var r = 0
                for(i in 1 .. arr.size-1){
                    if(arr[i] == 1){
                        if(q == 0 )q = i
                        else r = i
                    }
                }
                answer = q*r
            }
        }

        1 -> {
            answer = 0
            for(i in 1 .. arr.size-1){
                if(arr[i] != 0) {
                    answer = i
                    break
                }
            }
        }

    }

    return answer
}