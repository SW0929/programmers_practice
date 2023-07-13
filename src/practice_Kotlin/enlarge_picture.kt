package practice_Kotlin

class enlarge_picture {
}
fun main(){
    val array = arrayOf("x.x", ".x.", "x.x")
    println(enlargePictureSolution(array,3).contentToString())
}
fun enlargePictureSolution(picture: Array<String>, k: Int): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    var a = ""
    for (i in picture.indices){
        for (j in 0 until k){
            a = picture[i].map { it.toString().repeat(k) }.joinToString("")
            answer = answer.plus(a)
        }
    }
    return answer
}
fun enlargePictureSolution02(picture: Array<String>, k: Int): Array<String> {
    var answer = mutableListOf<String>()
    picture.forEach { line ->
        var result = ""
        line.forEach { pixcel -> repeat(k){ result += pixcel }}
        repeat(k) { answer.add(result) }
    }
    return answer.toTypedArray()
}

