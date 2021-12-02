object Solution {
  def firstUniqChar(s: String): Int = {
    val map = collection.mutable.Map[Char, Int]().withDefaultValue(0)
    s.foreach { ch => map(ch) += 1 }
    s.zipWithIndex.map { case(item, index) => if(map(item) == 1) return index }
    -1
  }
}