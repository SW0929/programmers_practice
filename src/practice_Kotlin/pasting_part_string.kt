package practice_Kotlin

class pasting_part_string {
}

fun main(){
    val array1 = arrayOf("progressive", "hamburger", "hammer", "ahocorasick")
    val array2 = arrayOf(intArrayOf(0,4), intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(7, 7))
    println(pastingPartStringSolution(array1,array2))
}

fun pastingPartStringSolution(my_strings: Array<String>, parts: Array<IntArray>) =
    my_strings.joinToString("") { it.slice(parts[my_strings.indexOf(it)][0]..parts[my_strings.indexOf(it)][1]) }

fun pastingPartStringSolution02(myStrings: Array<String>, parts: Array<IntArray>): String {
    return myStrings.indices.joinToString("") { myStrings[it].substring(parts[it][0], parts[it][1] + 1) }
}


