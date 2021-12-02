object Solution {
  import scala.collection.mutable._
  var map = Map[Int, Int]()

  def climbStairs(n: Int): Int = {
    if(n == 1) return 1
    else if (n == 2) return 2
    else {
      var (n_1, n_2) = (0, 0)
      if(map.contains(n-1)) n_1 = map(n-1)
      else {
        n_1 = climbStairs(n-1)
        map(n-1) = n_1
      }

      if(map.contains(n-2)) n_2 = map(n-2)
      else {
        n_2 = climbStairs(n-2)
        map(n-2) = n_2
      }
      n_1 + n_2
    }
  }
}