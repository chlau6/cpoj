package question;

import annotation.DivideAndConquer;
import annotation.Heap;
import annotation.LinkedLists;
import annotation.MergeSort;
import datastructure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

@LinkedLists
@DivideAndConquer
@Heap
@MergeSort
public class Q23 {
    /*
    Merge Sort
    Time Complexity: O(n log n) Space Complexity: O(1)
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        return partition(lists, 0, lists.length - 1);
    }

    private ListNode partition(ListNode[] lists, int left, int right) {
        if (left >= right) return lists[left];

        int mid = (left + right) / 2;

        ListNode leftNode = partition(lists, left, mid);
        ListNode rightNode = partition(lists, mid + 1, right);

        return merge(leftNode, rightNode);
    }

    private ListNode merge(ListNode a, ListNode b) {
        if (a == null) return null;
        if (b == null) return null;

        if (a.val <= b.val) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    /*
    Heap
    Time Complexity: O(n log n) Space Complexity: O(n)
     */
    public ListNode mergeKLists2(ListNode[] lists) {
        Queue<ListNode> pq = new PriorityQueue<>(Comparator.comparing(a -> a.val));

        for (ListNode node : lists) {
            while (node != null) {
                pq.add(node);
                node = node.next;
            }
        }

        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while (!pq.isEmpty()) {
            dummy.next = pq.poll();
            dummy = dummy.next;
        }

        dummy.next = null;
        return head.next;
    }
}

/*
23. Merge k Sorted Lists
 */
