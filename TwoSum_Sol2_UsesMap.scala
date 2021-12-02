object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var map = collection.mutable.Map[Int, Int]()
    for(i <- 0 until nums.length) {
      if(map.contains(target-nums(i))) return Array(i, map(target-nums(i)))
      else map += (nums(i) -> i)
    }
    throw new IllegalArgumentException("Two sum solution doesn't exist")
  }
}