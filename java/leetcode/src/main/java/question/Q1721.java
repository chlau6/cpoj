package question;

import datastructure.ListNode;

public class Q1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode first = null;
        ListNode second = null;

        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }

        first = fast;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        second = slow;

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}

/*
1721. Swapping Nodes in a Linked List
 */
