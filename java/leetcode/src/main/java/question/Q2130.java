package question;

import datastructure.ListNode;

public class Q2130 {
    public int pairSum(ListNode head) {
        int result = 0;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow.next);
        fast = head;

        while (slow != null) {
            result = Math.max(result, slow.val + fast.val);
            slow = slow.next;
            fast = fast.next;
        }

        return result;
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }
}
/*
2129. Capitalize the Title
 */
