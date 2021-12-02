/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
  def isPalindrome(head: ListNode): Boolean = {
    def reverse(head: ListNode): ListNode = {
      if(head == null || head.next == null) return head
      val temp = reverse(head.next)
      head.next.next = head
      head.next = null
      temp
    }

    var (prev, slow, fast) = (ListNode(), head, head)
    while(fast != null && fast.next != null) {
      prev = slow
      slow = slow.next
      fast = fast.next.next
    }

    val reversedHead = reverse(slow)

    var temp = head
    var tail = reversedHead
    while(temp != null && tail != null) {
      if(temp.x != tail.x) return false
      temp = temp.next
      tail = tail.next
    }
    true
  }
}