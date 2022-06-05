package question;

import datastructure.ListNode;

public class Q1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode list2Head = list2;
        ListNode list2Tail = list2;

        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }

        ListNode list1Head = list1;
        ListNode list1Tail = list1;

        for (int i = 0; i < a - 1; i++) {
            list1Head = list1Head.next;
        }

        for (int i = 0; i <= b; i++) {
            list1Tail = list1Tail.next;
        }

        list1Head.next = list2Head;
        list2Tail.next = list1Tail;

        return list1;
    }
}

/*
1669. Merge In Between Linked Lists
 */
