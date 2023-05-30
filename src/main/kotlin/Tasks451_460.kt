fun main() {
    val m = 4 // Replace with your desired matrix size
    val matrix = Array(m) { IntArray(m) } // Initialize the matrix

    // Populate the matrix with random values (for demonstration purposes)
    for (i in 0 until m) {
        for (j in 0 until m) {
            matrix[i][j] = (1..10).random()
        }
    }

    val vectorB = Array(m) { 0.0 } // Initialize the vector B

    for (i in 0 until m) {
        var sum = 0.0
        for (j in 0 until m) {
            // Calculate the arithmetic mean of the elements on the main and auxiliary diagonals
            if (j == i || j == m - 1 - i) {
                sum += matrix[i][j]
            }
        }
        vectorB[i] = sum / 2.0 // Divide the sum by 2 to get the arithmetic mean
    }

    // Print the resulting vector B
    println("Vector B:")
    for (i in 0 until m) {
        println(vectorB[i])
    }
}