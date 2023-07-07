package practice_Kotlin

class qr_code {
}
fun main(){
    println(qrCodeSolution03(3,1 , "qjnwezgrpirldywt"))
}
fun qrCodeSolution(q: Int, r: Int, code: String) =
    code.filterIndexed { index, c ->
        index % q == r
    }.map { it }.joinToString("")

fun qrCodeSolution02(q: Int, r: Int, code: String): String {
    //acc 는 자기 자신
    return code.foldIndexed("") { index, acc, n ->
        if (index % q == r) acc + n
        else acc
    }
}

fun qrCodeSolution03(q: Int, r: Int, code: String): String {
    return code.indices.filter { it % q == r }.joinToString(""){code[it].toString()}
}