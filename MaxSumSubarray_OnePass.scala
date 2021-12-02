object Solution {
  def maxSubArray(nums: Array[Int]): Int = {
    var maxSum = nums(0)
    var runningSum = nums(0)
    for(i <- 1 until nums.length) {
      runningSum = math.max(runningSum+nums(i), nums(i))
      maxSum = math.max(runningSum, maxSum)
    }
    maxSum
  }
}