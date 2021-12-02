object Solution {
  def climbStairs(n: Int): Int = {
    import scala.collection.mutable._
    var map = Map[Int, Int]()

    map(1) = 1
    map(2) = 2

    for(i <- 3 to n){
      map(i) = map(i-1) + map(i-2)
    }
    map(n)
  }
}