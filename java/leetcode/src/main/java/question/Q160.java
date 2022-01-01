package question;

import datastructure.ListNode;

public class Q160 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}

/*
160. Intersection of Two Linked Lists
 */
