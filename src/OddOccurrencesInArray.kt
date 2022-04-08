
import java.util.*


fun solution(A: IntArray): Int {

    Arrays.sort(A)
    var i = 0

    while (i < A.size - 1) {
        if (A[i] != A[i + 1]) {
            return A[i]
        }
        i += 2
    }

    return A[A.size - 1]
}


fun main() {
    println(solution(intArrayOf(9, 3, 9, 3, 9, 7, 9)))
}


fun temp(array: IntArray): Int {
    Arrays.sort(array)
    var i = 0
    while (i < array.size - 1) {
        if (array[i] != array[i + 1]) {
            return array[i]
        }
        i = i + 2
    }
    return array[array.size - 1]
}

/*val map = A.asSequence().groupBy { it }.map {it.value.size to it.key }.toMap()

    return  map.getValue(1)*/