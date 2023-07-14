package practice_Kotlin

class national_competition {
}
fun main(){
    val array = intArrayOf(3,7,2,5,4,6,1)
    val boolean = booleanArrayOf(false,true,true,true,true,false,false)
    println(nationalCompetitionSolution(array,boolean))
}
fun nationalCompetitionSolution(rank: IntArray, attendance: BooleanArray): Int {
    var answer: Int = 0
    var i = 1
    var a = intArrayOf()
    while (true){
        if (a.size == 3) {
            break
        }
        if(attendance[rank.indexOf(i)]){
            a = a.plus(rank.indexOf(i))
            println(a.contentToString())
        }
        i++

    }
    answer = a[0] * 10000 + a[1] * 100 + a[2]
    return answer
}