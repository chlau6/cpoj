package question;

import annotation.LinkedLists;
import annotation.Recursion;
import datastructure.ListNode;

@LinkedLists
@Recursion
public class Q24 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
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
