import kotlin.math.abs

fun solutionMissInt(A: IntArray): Int {
    if (A.isEmpty()) return 1
    if (!A.contains(1)) return 1

    var missElement = 1000000
    var minElement = A[0]
    var maxElement = A[0]

    for (i in A.indices) {

        maxElement = if (A[i] > maxElement) A[i] else maxElement
        minElement = if (A[i] < minElement) A[i] else minElement

        if (i + 1 == A.size) {
            if (A[i] > 0 && !A.contains(A[i] + 1) && missElement > A[i] + 1) missElement = A[i] + 1
            break
        }

        if (A[i] > 0 && abs(A[i + 1] - A[i]) > 1 && missElement > A[i] + 1 && !A.contains(A[i] + 1)) {
            missElement = A[i] + 1
        }

    }
    if (missElement == 1000000) {
        return if (minElement - 1 > 1) minElement - 1 else maxElement + 1
    }

    return missElement

}


fun main() {
    val result =  solutionMissInt(intArrayOf(4, 1, 5, 6, 2))

    print(result)

}