object Solution {
  def rotate(matrix: Array[Array[Int]]): Unit = {
    val n = matrix.length
    for(i <- 0 until n) {
      for(j <- 0 until i) {
        val temp = matrix(i)(j)
        matrix(i)(j) = matrix(j)(i)
        matrix(j)(i) = temp
      }
    }

    for(i <- 0 until n) {
      var (start, end) = (0, n-1)
      while(start < end) {
        val temp = matrix(i)(end)
        matrix(i)(end) = matrix(i)(start)
        matrix(i)(start) = temp
        start += 1
        end -= 1
      }
    }
  }
}