package question;

import annotation.HashTable;
import annotation.LinkedLists;
import annotation.TwoPointers;
import company.Facebook;
import datastructure.ListNode;

@HashTable
@LinkedLists
@TwoPointers
@Facebook
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
