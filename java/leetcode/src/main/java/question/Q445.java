package question;

import datastructure.ListNode;

import java.util.Stack;

public class Q445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode digit = new ListNode(0);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) {
                sum += s1.pop();
            }

            if (!s2.isEmpty()) {
                sum += s2.pop();
            }

            digit.val = sum % 10;
            sum /= 10;

            ListNode carry = new ListNode(sum);
            carry.next = digit;
            digit = carry;
        }

        return digit.val == 0 ? digit.next : digit;
    }
}

/*
445. Add Two Numbers II
 */
