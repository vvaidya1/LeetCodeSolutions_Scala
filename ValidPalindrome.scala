object Solution {
  def isPalindrome(s: String): Boolean = {
    val str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase
    var (start, end) = (0, str.length-1)
    while(start<end) {
      //println(str(start) + " " + str(end))
      if(str(start)!=str(end)) return false
      start += 1
      end -= 1
    }
    true
  }
}