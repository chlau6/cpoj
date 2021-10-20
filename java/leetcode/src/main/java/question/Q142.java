package question;

import annotation.HashTable;
import annotation.LinkedLists;
import annotation.TwoPointers;
import datastructure.ListNode;

@HashTable
@LinkedLists
@TwoPointers
public class Q142 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

/*
142. Linked List Cycle II
 */
