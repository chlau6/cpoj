package question;

import datastructure.ListNode;

public class Q203 {
    /*
    Recursive
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    /*
    Iterative
     */
    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) return null;

        ListNode pointer = head;

        while (pointer.next != null) {
            if (pointer.next.val == val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }

        return head.val == val ? head.next : head;
    }
}

/*
203. Remove Linked List Elements
 */
