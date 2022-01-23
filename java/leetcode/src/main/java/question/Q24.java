package question;

import datastructure.ListNode;

public class Q24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        ;
        newHead.next = head;

        return newHead;
    }
}

/*
23. Merge k Sorted Lists
 */
