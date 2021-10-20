package question;

import annotation.LinkedLists;
import datastructure.ListNode;

@LinkedLists
public class Q328 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
/*
328. Odd Even Linked List
 */
