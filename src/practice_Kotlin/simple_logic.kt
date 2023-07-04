package practice_Kotlin

class simple_logic {
}
fun main(){
    println(simpleLogicSolution(x1 = false, x2 = true, x3 = true, x4 = true))
}
fun simpleLogicSolution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean) = (x1 || x2) && (x3 || x4)