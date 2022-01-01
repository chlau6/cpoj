package question;

import datastructure.ListNode;

public class Q2 {
    /*
    Time Complexity: O(max(m, n))   Space Complexity: O(max(m, n))
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while (carry > 0 || l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}

/*
2. AddTwoNumbers
 */
