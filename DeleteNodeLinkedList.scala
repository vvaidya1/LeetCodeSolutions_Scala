/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */

object Solution {
  def deleteNode(node: ListNode): Unit = {
    val temp = node.next
    node.next = node.next.next
    node.x = temp.x
  }
}