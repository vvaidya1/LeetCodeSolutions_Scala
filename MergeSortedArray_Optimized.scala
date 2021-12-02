object Solution {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var index = nums1.length - 1
    var (i, j) = (m-1, n-1)
    while(index >= 0) {
      if(i < 0) {
        nums1(index) = nums2(j)
        j -= 1
      }
      else if (j < 0) {
        nums1(index) = nums1(i)
        i -= 1
      }
      else {
        if(nums1(i) <= nums2(j)) {
          nums1(index) = nums2(j)
          j -= 1
        }
        else {
          nums1(index) = nums1(i)
          i -= 1
        }
      }
      index -= 1
    }
  }
}