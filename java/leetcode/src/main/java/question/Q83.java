package question;

import datastructure.ListNode;

public class Q83 {
    /*
    Iteration
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;

        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    /*
    Recursion
     */
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null || head.next == null) return head;

        head.next = deleteDuplicates(head.next);

        return head.val == head.next.val ? head.next : head;
    }
}

/*
83. Remove Duplicates from Sorted List
 */
