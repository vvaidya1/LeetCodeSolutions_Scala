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
    if(root == null) return true

    import scala.collection.mutable._
    import util.control.Breaks._

    var queue = Queue[TreeNode]()
    queue.enqueue(root)
    queue.enqueue(root)

    while(queue.nonEmpty) {
      val node1 = queue.dequeue()
      val node2 = queue.dequeue()
      breakable{
        if(node1 == null && node2 == null)
          break
        else if(node1 != null && node2 != null && node1.value == node2.value) {
          queue.enqueue(node1.left)
          queue.enqueue(node2.right)
          queue.enqueue(node1.right)
          queue.enqueue(node2.left)
        }
        else return false
      }
    }
    true
  }
}