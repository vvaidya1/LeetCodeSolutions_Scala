object Solution {
  def climbStairs(n: Int): Int = {
    if(n == 1) return 1
    else if (n == 2) return 2
    else climbStairs(n-1) + climbStairs(n-2)
  }
}