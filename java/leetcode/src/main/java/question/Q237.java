package question;

import datastructure.ListNode;

public class Q237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
237. Delete Node in a Linked List
 */
