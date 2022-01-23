package question;

import datastructure.ListNode;

public class Q82 {
    /*
    Iterative, Two Pointer
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null) {
            ListNode curr = prev.next;

            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            if (curr != prev.next) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
        }

        return dummy.next;
    }

    /*
    Recursive
     */
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null) return head;

        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }

            return deleteDuplicates(head.next);
        }

        head.next = deleteDuplicates(head.next);

        return head;
    }
}

/*
82. Remove Duplicates from Sorted List II
 */
