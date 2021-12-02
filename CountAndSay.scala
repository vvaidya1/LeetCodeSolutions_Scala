object Solution {
  def countAndSay(n: Int): String = {
    if(n == 1) return "1"
    val temp = countAndSay(n-1)

    var (count, res) = (1, "")
    for(i <- 1 until temp.length) {
      if (temp(i-1) == temp(i)) {
        count += 1
      }
      else {
        res += count.toString + temp(i-1).toString
        count = 1
      }
    }

    res += count.toString + temp.last.toString
    res
  }
}