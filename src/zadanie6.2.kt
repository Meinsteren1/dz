fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val cols = matrix[0].size

    // Создаем новую матрицу с перевернутыми размерами
    val transposedMatrix = Array(cols) { IntArray(rows) }

    // Заполняем новую матрицу значениями из исходной матрицы, транспонируя их
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    val transposed = transposeMatrix(matrix)
    for (row in transposed) {
        println(row.joinToString())
    }
}
