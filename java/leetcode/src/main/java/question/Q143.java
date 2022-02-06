package question;

import datastructure.ListNode;

import java.util.Stack;

public class Q143 {
    /*
    Two Pointers
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        ListNode prev = null;
        slow.next = null;

        while (mid != null) {
            ListNode temp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = temp;
        }

        while (head != null && prev != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = prev.next;
            head.next.next = next;
            head = next;
        }
    }

    /*
    Stack
     */
    public void reorderList2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        ListNode temp = head;

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        int n = (stack.size() - 1) / 2;

        for (int i = 0; i < n; i++) {
            ListNode tail = stack.pop();
            ListNode next = head.next;
            head.next = tail;
            tail.next = next;
            head = next;
        }

        stack.pop().next = null;
    }
}

/*
143. Reorder List
 */
