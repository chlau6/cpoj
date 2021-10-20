package question;

import annotation.LinkedLists;
import annotation.Recursion;
import company.Facebook;
import datastructure.ListNode;

@LinkedLists
@Recursion
@Facebook
public class Q203 {
    /*
    Recursive
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    /*
    Iterative
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode removeElements2(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode pointer = dummy;

        while (pointer.next != null) {
            if (pointer.next.val == val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }

        return dummy.next;
    }
}

/*
203. Remove Linked List Elements
 */
