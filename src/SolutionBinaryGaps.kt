val ZERO = "ZERO"
val ONE = "ONE"
val MAX_ZERO = "MAX_ZERO"

fun solution(N: Int): Int {

    val map = HashMap<String, Int>()//.set(1,0)
    map[ZERO] = 0
    map[ONE] = 1
    map[MAX_ZERO] = 0

    Integer.toBinaryString(N).toCharArray().asSequence().map { Character.digit(it, 10) }
        .forEach {
            when {
                it == 0 -> map[ZERO] = map[ZERO]!!.plus(1)
                it == 1  -> {
                    if (map[ZERO]!! > map[MAX_ZERO]!!) map[MAX_ZERO] = map[ZERO]!!
                    map[ZERO] = 0
                }
            }


        }

    return map[MAX_ZERO]!!
}


fun main() {

    val str: String = 103.toString()//Integer.toBinaryString(9)
    println(Integer.toBinaryString(9))

    str.toCharArray().map{Character.digit(it, 2)}.filter { it >= 0 }.forEach { println(it)}
    println("123".reversed())

/*    val n = 328
    println(Integer.toBinaryString(n))
    println(solution(n))*/

}




