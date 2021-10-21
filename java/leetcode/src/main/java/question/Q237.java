package question;

import annotation.LinkedLists;
import datastructure.ListNode;

@LinkedLists
public class Q237 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
237. Delete Node in a Linked List
 */
