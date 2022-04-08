fun solutionIlend(X: Int, A: IntArray): Int {
    if (X == 0 || A.isEmpty()) return -1

    val map = HashMap<Int, Int>()
    val list = (1..X).toMutableList()
    var result = -1


    /*loop@ for (i in A.indices) {
        if (A[i] <= X) map.put(i, A[i])
        if (map.values.contains(X)){
            for (n in 1..X) {
                if (!map.values.contains(n)) continue@loop
            }

            result = i
            break@loop
        }
    }*/
    for (i in A.indices) {
        val element = A[i]
        if (element <= X) list.remove(element)
        if (list.isEmpty()) {
            result = i
            return  result
        }

    }

    return result
}

fun main() {
    var result = solutionIlend(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4))

    print(result)
}

