package question;

import datastructure.ListNode;

public class Q86 {
    public ListNode partition(ListNode head, int x) {
        ListNode first = new ListNode();
        ListNode second = new ListNode();

        ListNode firstHead = first;
        ListNode secondHead = second;

        while (head != null) {
            if (head.val < x) {
                first.next = head;
                first = first.next;
            } else {
                second.next = head;
                second = second.next;
            }

            head = head.next;
        }

        second.next = null;
        first.next = secondHead.next;

        return firstHead.next;
    }
}

/*
86. Partition List
 */
