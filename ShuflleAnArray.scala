class Solution(_nums: Array[Int]) {
  val copy: Array[Int] = Array.ofDim[Int](_nums.length)
  _nums.copyToArray(copy)

  /** Resets the array to its original configuration and return it. */
  def reset(): Array[Int] = {
    _nums
  }

  /** Returns a random shuffling of the array. */
  def shuffle(): Array[Int] = {
    import scala.util.Random
    val random = new Random()
    copy.indices.foreach { i =>
      val index = random.nextInt(_nums.length)
      val temp = copy(index)
      copy(index) = copy(i)
      copy(i) = temp
    }
    copy
  }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = new Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */