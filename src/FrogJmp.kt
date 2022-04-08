

fun solution(X: Int, Y: Int, D: Int): Int {
    val way = Y - X

    return way/ D + (if(way % D > 0) 1 else 0)
}


fun main() {
    println( solution(10, 85, 30))
}

