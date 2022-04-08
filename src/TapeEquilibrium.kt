fun getEquilibrium(A: IntArray): Int {
    var minVal = 0
    val arrayLength = A.size
    if (arrayLength == 2) {
        return Math.abs(A[1] - A[0])
    }
    for (split in 1 until arrayLength - 1) {
        A[split] = Math.abs(A[split] + A[split - 1])
    }
    val total = Math.abs(A[arrayLength - 2] + A[arrayLength - 1])
    minVal = total
    for (split in 0 until arrayLength - 1) {
        val rSum = Math.abs(A[split] - total)
        if (Math.abs(A[split] - rSum) < minVal) {
            minVal = Math.abs(A[split] - rSum)
        }
    }
    return minVal
}


fun main() {
     print( getEquilibrium(intArrayOf(3,1,2,4,3)))
}
