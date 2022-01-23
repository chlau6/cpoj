package question;

import datastructure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Q234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = slow.next;

        while (prev.next != null) {
            ListNode temp = prev.next;
            prev.next = temp.next;
            temp.next = slow.next;
            slow.next = temp;
        }

        slow = slow.next;
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }

        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = list.size() - 1;
        while (i <= j) {
            if (!list.get(i++).equals(list.get(j--))) {
                return false;
            }
        }
        return true;
    }


}

/*
234. Palindrome Linked List
 */
