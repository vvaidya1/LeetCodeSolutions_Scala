object Solution {
  def strStr(haystack: String, needle: String): Int = {
    if(needle.isEmpty) return 0
    if(haystack.length < needle.length) return -1

    var (i, j) = (0, 0)
    while(i < haystack.length && j < needle.length) {
      val temp = i
      while(i < haystack.length && j < needle.length && haystack(i) == needle(j)) {
        i += 1; j += 1
      }
      if(j == needle.length) return i-needle.length else { j = 0; i = temp+1}
    }
    -1
  }
}