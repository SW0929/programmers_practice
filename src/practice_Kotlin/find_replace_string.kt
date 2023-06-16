package practice_Kotlin

class find_replace_string {
}
fun main(){
    println(findReplaceStringSolution("ABBAA", "AABB"))
    println(findReplaceStringSolution02("ABBAA", "AABB"))
    println(findReplaceStringSolution03("ABBAA", "AABB"))
}
fun findReplaceStringSolution(myString: String, pat: String): Int {
    var answer: Int = 0
    var check = ""
    myString.forEach {
        check+=if (it == 'A'){
            'B'
        }else{
            'A'
        }
    }
    answer = if (check.contains(pat))
        1
    else
        0
    return answer
}

fun findReplaceStringSolution02(myString: String, pat: String): Int {
    val result = myString.map { if (it=='A')'B' else 'A' }.joinToString("").indexOf(pat)
    return if (result >= 0) 1 else 0
}
fun findReplaceStringSolution03(myString: String, pat: String): Int {
    return myString.map { if (it == 'A') 'B' else 'A' }
        .joinToString("")
        .let { if (it.contains(pat)) 1 else 0 }
        //let 은 자기 자신을 받아서 마지막 코드를 반환하는 스코프 함수
}