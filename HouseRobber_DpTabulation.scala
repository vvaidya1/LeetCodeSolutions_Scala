object Solution {
  def rob(nums: Array[Int]): Int = {
    var dp = Array.ofDim[Int](nums.length)

    if(nums.length == 0) return 0
    if(nums.length == 1) return nums(0)
    if(nums.length == 2) return math.max(nums(0), nums(1))

    dp(0) = nums(0)
    dp(1) = math.max(nums(0), nums(1))
    for(i <- 2 until nums.length) {
      dp(i) = math.max(dp(i-2)+nums(i), dp(i-1))
    }
    dp.last
  }
}