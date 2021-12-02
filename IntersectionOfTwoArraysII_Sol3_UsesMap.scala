object Solution {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    var nums1Map: Map[Int, Int] = nums1.groupBy(identity).mapValues(_.length).toMap
    nums2.flatMap(x =>
      if (nums1Map.contains(x) && nums1Map(x) > 0) {
        nums1Map = nums1Map.updated(x, nums1Map(x) - 1)
        List(x)
      }
      else List.empty
    ).toArray
  }
}