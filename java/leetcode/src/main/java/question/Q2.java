package question;

import annotation.LinkedLists;
import annotation.Maths;
import annotation.Recursion;
import company.Facebook;
import datastructure.ListNode;

@LinkedLists
@Maths
@Recursion
@Facebook
public class Q2 {
    /*
    Time Complexity: O(max(m, n))   Space Complexity: O(max(m, n))
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode dummy = new ListNode();
        ListNode pointer = dummy;

        while (l1 != null || l2 != null) {
            int digitSum = carry;

            if (l1 != null) {
                digitSum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                digitSum += l2.val;
                l2 = l2.next;
            }

            pointer.next = new ListNode(digitSum % 10);
            pointer = pointer.next;
            carry = digitSum / 10;
        }

        if (carry > 0) {
            pointer.next = new ListNode(carry);
        }

        return dummy.next;
    }
}

/*
2. AddTwoNumbers
 */
