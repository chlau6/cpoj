package question;

import datastructure.ListNode;

public class Q61 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;

        int count = 1;

        ListNode pointer = head;

        while (pointer.next != null) {
            pointer = pointer.next;
            count++;
        }

        pointer.next = head;

        int loop = count - (k % count);

        for (int i = 0; i < loop; i++) {
            pointer = pointer.next;
        }

        head = pointer.next;
        pointer.next = null;

        return head;
    }
}

/*
61. Rotate List
 */