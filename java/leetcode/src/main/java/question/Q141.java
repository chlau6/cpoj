package question;

import datastructure.ListNode;

public class Q141 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

/*
141. Linked List Cycle
 */
