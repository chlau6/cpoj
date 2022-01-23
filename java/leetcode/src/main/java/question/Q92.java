package question;

import datastructure.ListNode;

public class Q92 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for (int i = left; i < right; i++) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return dummy.next;
    }
}

/*
92. Reverse Linked List II
 */
