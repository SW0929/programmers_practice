package practice_Kotlin

class upcase_lowcase {
}
fun main(){
    val array = arrayOf("AAA","BBB","CCC","DDD")
    println(upCaseLowCaseSolution01(array))
    println(upCaseLowCaseSolution02(array))
}
fun upCaseLowCaseSolution01(strArr: Array<String>) = (strArr.indices).map {
    if (it % 2 == 0)
        strArr[it].lowercase()
    else
        strArr[it].uppercase()
}
//훨씬 빠름
fun upCaseLowCaseSolution02(strArr: Array<String>) = strArr.mapIndexed { index, s ->
    if (index % 2 == 0)
        s.lowercase()
    else
        s.uppercase()
}