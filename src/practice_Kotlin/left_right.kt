package practice_Kotlin

class left_right {
}
fun main(){
    val array = arrayOf("u","l","u","r")
    println(leftRightSolution(array).contentToString())
}
fun leftRightSolution(str_list: Array<String>): Array<String> {
    var answer = arrayOf<String>()


    answer = if (str_list.contains("l") && str_list.contains("r")){
        if (str_list.indexOf("l") < str_list.indexOf("r")){
            str_list.copyOfRange(0, str_list.indexOf("l"))
        }else{
            str_list.copyOfRange(str_list.indexOf("r")+1, str_list.size)
        }
    }else{
        if (str_list.contains("l")){
            str_list.copyOfRange(0, str_list.indexOf("l"))
        }else if(str_list.contains("r")){
            str_list.copyOfRange(str_list.indexOf("r")+1, str_list.size)
        }else{
            return answer
        }
    }
    return answer
}
fun leftRightSolution02(str_list: Array<String>): Array<String> {
    var i = str_list.indexOfFirst { it == "l" || it == "r" }
    return when{
        i < 0 -> emptyList<String>()
        str_list[i] == "l" -> str_list.slice(0 until i)
        else -> str_list.slice(i + 1.. str_list.lastIndex)
    }.toTypedArray()
}