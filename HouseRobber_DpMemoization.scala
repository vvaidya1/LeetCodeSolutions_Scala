object Solution {
  def rob(nums: Array[Int]): Int = {
    import scala.collection.mutable._
    var map = Map[Int, Int]()
    def robUtil(index: Int): Int = {
      if(index < 0) return 0
      else if (index == 0) return nums(0)
      else if (index == 1) return math.max(nums(0), nums(1))
      else {
        var (n_1, n_2) = (0, 0)
        if(map.contains(index-1)) n_1 = map(index-1) else {
          n_1 = robUtil(index-1)
          map(index-1) = n_1
        }

        if(map.contains(index-2)) n_2 = map(index-2) else {
          n_2 = robUtil(index-2)
          map(index-2) = n_2
        }
        math.max(nums(index) + n_2, n_1)
      }
    }

    robUtil(nums.length-1)
  }
}