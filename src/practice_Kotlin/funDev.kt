package practice_Kotlin

class funDev {

}

fun main() {
    val intArray = intArrayOf(93, 30, 55)
    val speeds = intArrayOf(1, 30, 5)
    print(solution(intArray, speeds).contentToString())
}

fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = mutableListOf<Int>()
    var maxProgress = 0
    var count = 0

    for (i in progresses.indices) {
        val remainingProgress = 100 - progresses[i]
        val days = remainingProgress / speeds[i] + if (remainingProgress % speeds[i] > 0) 1 else 0

        if (days > maxProgress) {
            if (count > 0) {
                answer.add(count)
                count = 0
            }
            maxProgress = days
        }

        count++
    }

    answer.add(count)

    return answer.toIntArray()
}