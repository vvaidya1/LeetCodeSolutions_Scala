object Solution {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    for (row <- board) {
      val rowSet = collection.mutable.Set[Char]()
      for (index <- 0 until 9) {
        if (row(index) != '.') {
          if (!rowSet.contains(row(index))) rowSet += row(index)
          else return false
        }
      }
    }

    for (index <- 0 until 9) {
      val colSet = collection.mutable.Set[Char]()
      for (row <- board) {
        if (row(index) != '.') {
          if (!colSet.contains(row(index))) colSet += row(index)
          else return false
        }
      }
    }

    for (i <- 0 until 9 by 3) {
      for (j <- 0 until 9 by 3) {
        val matrix = collection.mutable.Set[Char]()
        for (k <- 0 until 3) {
          for (l <- 0 until 3) {
            //print(board(i+k)(j+l))
            if (board(i + k)(j + l) != '.') {
              if (!matrix.contains(board(i + k)(j + l))) matrix += board(i + k)(j + l)
              else return false
            }
          }
          //println()
        }
        //println()
      }
    }
    true
  }
}