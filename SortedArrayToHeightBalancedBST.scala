/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    def sortedArrayToBSTUtil(start: Int, end: Int): TreeNode = {
      if(end < start) return null
      val mid = (start + end)/2
      TreeNode(nums(mid), sortedArrayToBSTUtil(start, mid-1), sortedArrayToBSTUtil(mid+1, end))
    }

    if(nums.length == 1) return TreeNode(nums(0), null, null)
    sortedArrayToBSTUtil(0, nums.length-1)
  }
}