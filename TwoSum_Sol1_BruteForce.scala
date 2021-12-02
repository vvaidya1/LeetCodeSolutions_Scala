object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for(i <- 0 until nums.length) {
      val index = nums.slice(i+1, nums.length).indexOf(target-nums(i))
      if (index != -1) return Array[Int](i, i+index+1)
    }
    Array.empty
  }
}