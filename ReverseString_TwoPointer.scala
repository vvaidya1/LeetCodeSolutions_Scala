object Solution {
  def reverseString(s: Array[Char]): Unit = {
    var (start, end) = (0, s.length-1)
    while(start < end) {
      val temp = s(end)
      s(end) = s(start)
      s(start) = temp
      start += 1
      end -= 1
    }
  }
}