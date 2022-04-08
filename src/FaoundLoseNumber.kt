import java.util.Arrays

fun searchLoseNomber(A: IntArray): Int {

    Arrays.sort(A)
    if (A.isEmpty()) return 1
    for (i in A.indices) {

        when {
            i + 1 == A.size -> return if(A[0] != 1) 1 else A[i] + 1
            A[i + 1] - A[i] > 1 ->  return A[i] + 1
        }

    }

    return 1

}

fun main() {
        print( searchLoseNomber(intArrayOf(1)))
}