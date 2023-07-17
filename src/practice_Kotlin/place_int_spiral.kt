package practice_Kotlin

class place_int_spiral {
}
fun main(){
    println(placeIntSpiralSolution(4).contentDeepToString())
}
fun placeIntSpiralSolution(n: Int): Array<IntArray> {
    var array = Array(n) { IntArray(n)}
    var num = 1
    var rowStart = 0
    var rowEnd = n - 1
    var colStart = 0
    var colEnd = n - 1
    var check = 0
    while (rowStart <= rowEnd && colStart <= colEnd) {

        // 왼쪽에서 오른쪽으로
        for (i in colStart..colEnd) {
            println(i)
            array[rowStart][i] = num++
        }
        rowStart++

        // 위에서 아래로
        for (i in rowStart..rowEnd) {
            array[i][colEnd] = num++
        }
        colEnd--

        // 오른쪽에서 왼쪽으로
        for (i in colEnd downTo colStart) {
            array[rowEnd][i] = num++
        }
        rowEnd--

        // 아래에서 위로
        for (i in rowEnd downTo rowStart) {
            array[i][colStart] = num++
        }
        colStart++

    }

    return array
}