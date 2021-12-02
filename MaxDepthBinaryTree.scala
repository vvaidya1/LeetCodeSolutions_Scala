/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
  def maxDepth(root: TreeNode): Int = {
    if(root == null) return 0
    Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1)
  }
}