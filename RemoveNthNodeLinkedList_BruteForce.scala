/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    var length = 1
    var node = head
    while(node.next != null) {
      node = node.next
      length += 1
    }

    if(length == n) return head.next

    var (k, i) = (length-n-1, 0)
    var temp = head
    while(i < k) {
      i += 1
      temp = temp.next
    }

    temp.next = if (temp.next == null) null else temp.next.next
    head
  }
}