package question;

import datastructure.ListNode;

public class Q147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);

        while (head != null) {
            ListNode curr = dummy;

            while (curr.next != null && curr.next.val <= head.val) {
                curr = curr.next;
            }

            ListNode temp = head.next;
            head.next = curr.next;
            curr.next = head;
            head = temp;
        }

        return dummy.next;
    }
}

/*
147. Insertion Sort List
 */
