package question;

import datastructure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q23 {
    /*
    Merge Sort
    Time Complexity: O(n log k) Space Complexity: O(n + log k)
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        int n = lists.length;

        return partition(lists, 0, n - 1);
    }

    public ListNode partition(ListNode[] lists, int left, int right) {
        if (left >= right) return lists[left];

        int mid = left + (right - left) / 2;

        ListNode leftNode = partition(lists, left, mid);
        ListNode rightNode = partition(lists, mid + 1, right);

        return merge(leftNode, rightNode);
    }

    public ListNode merge(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;

        if (left.val <= right.val) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    /*
    Heap
    Time Complexity: O(n log k) Space Complexity: O(k)
     */
    public ListNode mergeKLists2(ListNode[] lists) {
        Queue<ListNode> pq = new PriorityQueue<>(Comparator.comparing(a -> a.val));

        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode();
        ListNode head = dummy;

        while (!pq.isEmpty()) {
            head.next = pq.poll();

            head = head.next;

            if (head.next != null) {
                pq.add(head.next);
            }
        }

        head.next = null;

        return dummy.next;
    }
}

/*
23. Merge k Sorted Lists
 */
