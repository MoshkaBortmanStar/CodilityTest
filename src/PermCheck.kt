import java.util.Arrays

fun solutionPerm(A: IntArray): Int {


    Arrays.sort(A)
    if (A[0] != 1) return 0

    for (i in A.indices) {
        if (i + 1 >= A.size) break

        when {
            A[i + 1] == A[i] -> return 0
            A[i + 1] - A[i] > 1 -> return 0
        }
    }

    return 1
}

fun main() {
    var result = solutionPerm(intArrayOf(4, 1, 3, 4, 2))

    print(result)
}
