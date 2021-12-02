object Solution {
  def moveZeroes(nums: Array[Int]): Unit = {
    val zeros = nums.count(_ == 0)
    var index = 0
    for(i <- 0 until nums.length) {
      if(nums(i) != 0) {
        nums(index) = nums(i)
        index += 1
      }
    }

    while(index != nums.length) {
      nums(index) = 0
      index += 1
    }
  }
}