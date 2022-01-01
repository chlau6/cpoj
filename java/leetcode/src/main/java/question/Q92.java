package question;

import datastructure.ListNode;

public class Q92 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for (int i = left; i < right; i++) {
            ListNode t = curr.next;
            curr.next = t.next;
            t.next = prev.next;
            prev.next = t;
        }

        return dummy.next;
    }
}

/*
92. Reverse Linked List II
 */
