import scala.util.control.Breaks._
object Solution {
  def plusOne(digits: Array[Int]): Array[Int] = {
    var i = digits.length-1
    breakable {
      do {
        if(digits(i) + 1 > 9) {
          digits(i) = (digits(i) + 1) % 10
        }
        else {
          digits(i) = digits(i) + 1
          break
        }
        i -= 1
      } while(i >= 0)
    }
    if(i == -1 && digits(0) == 0) 1 +: digits else digits
  }
}