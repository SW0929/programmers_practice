package hash

class costume_kt {
}
fun main(){
    val array = arrayOf(arrayOf("yellow_hat", "headgear"), arrayOf("blue_sunglasses", "eyewear"), arrayOf("green_turban", "headgear"))
    println(costumeSolution(array))
}
fun costumeSolution(clothes: Array<Array<String>>): Int {
    var answer = 1
    var hm : HashMap<String, Int> = hashMapOf()
    //종류별 의상 수
    for (i in clothes.indices){
        hm[clothes[i][1]] = hm.getOrDefault(clothes[i][1],0)+1
    }
    // +1은 착용하지 않은 경우 고려
    for (i in hm.values){
        answer *= i + 1
    }
    //-1은 모두 착용하지 않은 경우 때문
    return answer - 1
}