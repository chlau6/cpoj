package question;

import annotation.LinkedLists;
import annotation.TwoPointers;
import company.Facebook;
import datastructure.ListNode;

@LinkedLists
@TwoPointers
@Facebook
public class Q19 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}

/*
19. Remove Nth Node From End of List
 */
