package question;

import datastructure.ListNode;

public class Q876 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;

        while (head != null && head.next != null) {
            slow = slow.next;
            head = head.next.next;
        }

        return slow;
    }
}

/*
876. Middle of the Linked List
 */
