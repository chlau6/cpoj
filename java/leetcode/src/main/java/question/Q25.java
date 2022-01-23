package question;

import datastructure.ListNode;

public class Q25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;

        int count = 0;
        while (tail != null && count != k) {
            tail = tail.next;
            count++;
        }

        if (count != k) return head;

        tail = reverseKGroup(tail, k);

        while (--count >= 0) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }

        return tail;
    }
}

/*
25. Reverse Nodes in k-Group
 */
