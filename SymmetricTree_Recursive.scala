/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
  def isSymmetric(root: TreeNode): Boolean = {
    def isMirror(root1: TreeNode, root2: TreeNode): Boolean = {
      if(root1 == null && root2 == null) return true
      if(root1 != null && root2 != null && root1.value == root2.value)
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left)
      false
    }

    isMirror(root, root)
  }
}