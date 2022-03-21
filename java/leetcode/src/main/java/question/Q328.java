package question;

import datastructure.ListNode;

public class Q328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode even = new ListNode();
        ListNode d1 = odd;
        ListNode d2 = even;
        boolean isOdd = true;

        while (head != null) {
            if (isOdd) {
                d1.next = head;
                d1 = d1.next;
            } else {
                d2.next = head;
                d2 = d2.next;
            }

            head = head.next;
            isOdd = !isOdd;
        }

        d2.next = null;
        d1.next = even.next;

        return odd.next;
    }
}
/*
328. Odd Even Linked List
 */
