object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    if(s.length != t.length) return false
    val sMap = s.groupBy(identity).toMap
    val tMap = t.groupBy(identity).toMap
    if(sMap == tMap) true else false
  }
}