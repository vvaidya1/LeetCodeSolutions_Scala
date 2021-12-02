object Solution {
  def reverseString(s: Array[Char]): Unit = {
    def helper(start: Int, end: Int): Unit = {
      if(start >= end) return
      val temp = s(end)
      s(end) = s(start)
      s(start) = temp
      helper(start+1, end-1)
    }

    helper(0, s.length-1)
  }
}