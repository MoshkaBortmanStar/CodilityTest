class ArrayCyclicRotation {
}


fun solution(A: IntArray, K: Int): IntArray {
    if (A.size == K) return A

    val aCopy = A.copyOf()
    val size = A.size
    val correctCycle = if (K > size) K - size else K

    for (i in A.indices) {
        val index = (i + correctCycle) % size
        aCopy[index] = A[i]

    }
    return aCopy

}


fun main() {
    solution(intArrayOf(3, 8, 9, 7, 6), 3).forEach { print("$it, ") }
}