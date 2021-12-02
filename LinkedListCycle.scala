/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */

object Solution {
  def hasCycle(head: ListNode): Boolean = {
    if(head == null) return false
    var (slow, fast) = (head, head)
    while(fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
      if(slow == fast) return true
    }
    false
  }
}