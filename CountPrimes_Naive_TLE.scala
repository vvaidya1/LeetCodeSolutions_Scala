object Solution {
  def countPrimes(n: Int): Int = {
    def isPrime(num: Int): Boolean = {
      if(num <= 1) return false
      for(i <- 2 until num if i*i <= num) {
        if(num % i == 0) return false
      }
      true
    }

    var res = 0
    for(i <- 1 until n) {
      if(isPrime(i)) res += 1
    }
    res
  }
}