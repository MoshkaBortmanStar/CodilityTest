package EPAM

fun solution(A: Int, B: Int): Int {
  return  Integer.toBinaryString(A * B).count { it == '1' }
}



fun getPAllindrom(S: String) :String {

    var map = S.toCharArray().map { it }.groupBy { it}.map { it.key.toString().toInt() to it.value.size }.toMap()
    var maxOneValue = 0
    var doublevalue = 0
    for (value in map) {
        when {
            value.value == 1 -> if (maxOneValue < value.key) maxOneValue = value.key
            value.value > 1 && value.value % 2 == 0 -> if (doublevalue < value.value)  doublevalue = value.value
        }

    }

    return "0"
}

/*private fun isPAllendrom(str: String): Boolean {
    if (str.length == 1) return  str.equals(str.reversed())


}*/

fun addDigite(n: Int): String {
    var str: String = ""
    if (n == 1) return str
    for ( x in 1..n) {
        str += "1"
    }

    return str
}

fun main() {
    //getPAllindrom("8199")
   print( addDigite(2))

}