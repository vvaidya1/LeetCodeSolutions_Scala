object Solution {
  def myAtoi(s: String): Int = {
    val str = s.replaceAll("^\\s+", "")
    var (isNegative, i) = (false, 0)
    if(str.nonEmpty) {
      if(str(0) == '-' || str(0) == '+') i += 1
      isNegative = if(str(0) == '-') true else false
    }

    var res = ""
    while(i<str.length && str(i).isDigit) {
      res += str(i)
      i += 1
    }

    var (temp, multiplier) = (0, if(isNegative) -1 else 1)
    res.foreach(ch => {
      //println(ch)
      if(temp < Int.MinValue / 10) return Int.MinValue
      else if(temp > Int.MaxValue / 10) return Int.MaxValue
      else if(temp == Int.MinValue / 10 && ch.asDigit > 8) return Int.MinValue
      else if(temp == Int.MaxValue / 10 && ch.asDigit > 7) return Int.MaxValue
      temp = temp * 10 + ch.asDigit * multiplier
    })
    temp.toInt
  }
}