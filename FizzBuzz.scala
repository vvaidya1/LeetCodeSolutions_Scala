object Solution {
  def fizzBuzz(n: Int): List[String] = {
    var res: List[String] = List[String]()
    for(i <- 1 to n) {
      if(i % (3*5) == 0)
        res = res :+ "FizzBuzz"
      else if (i % 3 == 0)
        res = res :+ "Fizz"
      else if (i % 5 == 0)
        res = res :+ "Buzz"
      else res = res :+ i.toString
    }
    res
  }
}