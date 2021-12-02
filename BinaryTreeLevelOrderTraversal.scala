/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    if(root == null) return List.empty

    import scala.collection.mutable._
    var queue1 = Queue[TreeNode]()
    var queue2 = Queue[TreeNode]()
    var result = List[List[Int]]()

    queue1.enqueue(root)
    while(queue1.nonEmpty || queue2.nonEmpty) {
      var res = List[Int]()
      while(queue1.nonEmpty) {
        val node = queue1.dequeue()
        if(node != null) {
          res = res :+ node.value
          queue2.enqueue(node.left)
          queue2.enqueue(node.right)
        }
      }
      result = if(res.nonEmpty) result :+ res else result

      res = List.empty
      while(queue2.nonEmpty) {
        val node = queue2.dequeue()
        if(node != null) {
          res = res :+ node.value
          queue1.enqueue(node.left)
          queue1.enqueue(node.right)
        }
      }
      result = if(res.nonEmpty) result :+ res else result
    }
    result
  }
}