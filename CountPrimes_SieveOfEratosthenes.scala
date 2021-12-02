object Solution {
  def countPrimes(n: Int): Int = {
    if(n <= 1) return 0
    var isPrimeMap = Array.fill[Boolean](n)(true)
    isPrimeMap(0) = false
    isPrimeMap(1) = false

    val sqrRoot = math.sqrt(n).toInt
    for(i <- 2 to sqrRoot) {
      if(isPrimeMap(i) == true) {
        for(j <- i*i to n by i if j<n) {
          isPrimeMap(j) = false
        }
      }
    }

    var res = 0
    for(j <- 0 until n) {
      if(isPrimeMap(j)) res += 1
    }
    res
  }
}