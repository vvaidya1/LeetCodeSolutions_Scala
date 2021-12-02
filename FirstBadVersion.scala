/* The isBadVersion API is defined in the parent class VersionControl.
      def isBadVersion(version: Int): Boolean = {} */

class Solution extends VersionControl {
  def firstBadVersion(n: Int): Int = {
    var (start, end, mid, res) = (1, n, 0, 0)
    while(start <= end) {
      mid = start + (end-start)/2
      if(isBadVersion(mid)) {
        res = mid
        end = mid-1
      } else start = mid+1
    }
    res
  }
}