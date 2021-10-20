package question;

import annotation.LinkedLists;
import annotation.TwoPointers;
import datastructure.ListNode;

@LinkedLists
@TwoPointers
public class Q61 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int len = 1;
        ListNode temp = head;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        temp.next = head;
        int rotate = len - (k % len);

        for (int i = 0; i < rotate; i++) {
            temp = temp.next;
        }

        ListNode ans = temp.next;
        temp.next = null;

        return ans;
    }
}

/*
61. Rotate List
 */