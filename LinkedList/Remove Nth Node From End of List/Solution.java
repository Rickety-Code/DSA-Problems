public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode fast = head, slow = head;
    while(n-- > 0) {
        fast = fast.next;
    }
    if(fast == null) {
        return head.next;
    }
    while(sec.next != null) {
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return head;
}
 
 