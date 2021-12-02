object Solution {
  def reverse(x: Int): Int = {
    val isPos = if(x > 0) true else false
    var (i, res) = (if(isPos) x else -x, "0")
    while(i > 0) {
      //-2147483648 (-2^31) to 2147483647 (2^31-1)
      if(res.toInt > Int.MaxValue/10) return 0
      else if(res.toInt == Int.MaxValue/10 && i%10 > 7) return 0
      else {
        res += (i%10).toString
        i = i/10
      }
    }
    if(isPos) res.toInt else -res.toInt
  }
}