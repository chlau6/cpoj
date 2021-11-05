package question;

import annotation.LinkedLists;
import annotation.Maths;
import datastructure.ListNode;

@LinkedLists
@Maths
public class Q1290 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
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
