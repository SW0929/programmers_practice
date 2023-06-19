package practice_Kotlin

class five_each {
}
fun main(){
    val array = arrayOf("nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx")
    println(fiveEachSolution(array).contentToString())
}
fun fiveEachSolution(names: Array<String>): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    for (i in names.indices step 5){
        answer = answer.plus(names[i])
    }
    return answer
}
//간결하지만 수행시간이 너무 오래걸림
fun fiveEachSolution02(names: Array<String>): Array<String> {
    return names.toList().chunked(5) {it[0]}.toTypedArray()
}