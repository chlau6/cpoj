package question;

import datastructure.ListNode;
import datastructure.TreeNode;

public class Q109 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        return helper(head, null);
    }

    public TreeNode helper(ListNode head, ListNode tail) {
        if (head == tail) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode node = new TreeNode(slow.val);
        node.left = helper(head, slow);
        node.right = helper(slow.next, tail);

        return node;
    }
}

/*
109. Convert Sorted List to Binary Search Tree
 */