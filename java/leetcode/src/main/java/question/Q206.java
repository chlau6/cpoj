package question;

import datastructure.ListNode;

public class Q206 {
    /*
    Iterative
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    /*
    Recursive
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    // 1 -> 2
    // 1 -> 2 -> 1
    // 2 -> 1
}

/*
206. Reverse Linked List
 */
