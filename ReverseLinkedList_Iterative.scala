/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
  def reverseList(head: ListNode): ListNode = {
    if(head == null || head.next == null) return head
    var node = head
    var prev: ListNode = null
    while(node.next != null) {
      val temp = node.next
      node.next = prev
      prev = node
      node = temp
    }
    node.next = prev
    node
  }
}