package question;

import datastructure.ListNode;

public class Q1290 {
    public int getDecimalValue(ListNode head) {
        int num = 0;

        while (head != null) {
            num <<= 1;
            num += head.val;
            head = head.next;
        }

        return num;
    }
}

/*
1290. Convert Binary Number in a Linked List to Integer
 */
