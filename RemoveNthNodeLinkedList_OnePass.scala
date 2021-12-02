/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    var (i, temp) = (0, head)
    while(i < n) {
      i += 1
      temp = temp.next
    }

    if(temp == null) return head.next

    var node = head
    while(temp.next != null) {
      temp = temp.next
      node = node.next
    }
    node.next = if(node.next == null) null else node.next.next
    head
  }
}