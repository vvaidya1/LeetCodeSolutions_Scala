object Solution {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var (i, j, k) = (0, 0, 0)
    var tempArr = Array.ofDim[Int](m+n)

    while(i < m && j < n) {
      if(nums1(i) <= nums2(j)) {
        tempArr(k) = nums1(i)
        i += 1
      }
      else {
        tempArr(k) = nums2(j)
        j += 1
      }
      k += 1
    }

    if(i == m) {
      while(j < n) {
        tempArr(k) = nums2(j)
        j += 1
        k += 1
      }
    }
    else {
      while(i < m) {
        tempArr(k) = nums1(i)
        i += 1
        k += 1
      }
    }

    i = 0
    k = 0
    while(i < m+n) {
      nums1(i) = tempArr(k)
      i += 1
      k += 1
    }
  }
}