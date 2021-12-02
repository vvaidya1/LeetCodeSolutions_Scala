object Solution {
  def longestCommonPrefix(strs: Array[String]): String = {
    var (res, i) = (strs(0), strs(0).length-1)
    while(res.nonEmpty) {
      if(strs.forall(_.startsWith(res))) return res
      else res = res.slice(0, i)
      i -= 1
    }
    ""
  }
}