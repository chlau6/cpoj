package question;

import datastructure.ListNode;

public class Q21 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        temp.next = l1 != null ? l1 : l2;

        return dummy.next;
    }
}

/*
21. Merge Two Sorted Lists
 */
