package practice_Kotlin

class coffee_order {
}
fun main(){
    val a = arrayOf("cafelatte", "americanoice", "hotcafelatte", "anything")
    println(coffeeOrderSolution02(a))
}
fun coffeeOrderSolution(order: Array<String>): Int {
    var answer: Int = 0
    val americano = "americano"
    val latte = "cafelatte"
    order.forEach {
        println(answer)
        answer += if (americano in it){
                4500
            }
            else if (latte in it){
                5000
            }
            else {
                4500
            }
        }
    return answer
}
fun coffeeOrderSolution02(order: Array<String>) =
    order.map { if (it.contains("cafelatte")) 5000 else 4500 }.sum()