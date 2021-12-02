/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
  def isValidBST(root: TreeNode): Boolean = {
    def isValidBSTUtil(root: TreeNode, min: Double, max: Double): Boolean = {
      if(root == null) return true
      if(root.value <= min || root.value >= max) return false
      return isValidBSTUtil(root.left, min, root.value) && isValidBSTUtil(root.right, root.value, max)
    }

    isValidBSTUtil(root, Double.MinValue, Double.MaxValue)
  }
}