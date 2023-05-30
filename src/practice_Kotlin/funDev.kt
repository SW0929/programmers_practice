package practice_Kotlin

class funDev {

}

fun main() {
    val intArray = arrayListOf(93, 30, 55)
    val speeds = arrayListOf(1, 30, 5)
    solution(intArray, speeds)
}

fun solution(progresses: ArrayList<Int>, speeds: ArrayList<Int>): ArrayList<Int> {
    var answer = arrayListOf<Int>()
    var release = 1
    var i = 0
    while (progresses.isNotEmpty()){

            progresses[i] += speeds[i]
            if (i == 0){
                answer.add(release)
                release = 1
            }else{
                if (progresses[i] >= 100){
                    release++
                    progresses.remove(i)
                    speeds.remove(i)
                }
            }
        if (i == progresses.size){
            i == 0
        }

    }


    return answer
}