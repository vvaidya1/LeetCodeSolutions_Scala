object Solution {
  def reverse(x: Int): Int = {
    val isPos = if(x > 0) true else false
    var (i, res) = (if(isPos) x else -x, "")
    while(i > 0) {
      res += (i%10).toString
      i = i/10
    }

    scala.util.Try(res.toInt).toOption match {
      case Some(x) => if(isPos) x else -x
      case None => 0
    }
  }
}