package question;

import annotation.LinkedLists;
import datastructure.ListNode;

@LinkedLists
public class Q83 {
    /*
    Iteration
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;

        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    /*
    Recursion
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null || head.next == null) return head;

        head.next = deleteDuplicates(head.next);

        return head.val == head.next.val ? head.next : head;
    }
}

/*
83. Remove Duplicates from Sorted List
 */
