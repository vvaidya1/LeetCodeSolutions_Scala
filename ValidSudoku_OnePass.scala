def isValidSudoku(board: Array[Array[Char]]): Boolean = {
  var rowMap = Array.fill(9)(Set[Char]())
  val colMap = Array.fill(9)(Set[Char]())
  val matrixMap = Array.fill(9)(Set[Char]())

  for (i <- 0 until 9) {
    for (j <- 0 until 9) {
      if (board(i)(j) != '.') {
        if (rowMap(i).contains(board(i)(j))) return false else rowMap(i) += board(i)(j)
        if (colMap(j).contains(board(i)(j))) return false else colMap(j) += board(i)(j)

        val matIndex = (i / 3) * 3 + j / 3
        if (matrixMap(matIndex).contains(board(i)(j))) return false else matrixMap(matIndex) += board(i)(j)
      }
    }
  }
  true
}