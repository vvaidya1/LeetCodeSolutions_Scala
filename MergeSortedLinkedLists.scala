/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    var head: ListNode = null
    if(l1 == null) return l2
    else if(l2 == null) return l1
    else {
      var (list1, list2) = (l1, l2)
      var list = ListNode()
      while(list1 != null && list2 != null) {
        if(list1.x <= list2.x) {
          list.next = list1
          list1 = list1.next
        } else {
          list.next = list2
          list2 = list2.next
        }
        if(head == null) head = list.next
        list = list.next
      }
      list.next = if(list1 == null) list2 else list1
    }
    head
  }
}