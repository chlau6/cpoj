package question;

public class Q707 {
    /*
    get: Time Complexity: O(n) Space Complexity: O(1)
    addAtHead: Time Complexity: O(1) Space Complexity: O(1)
    addAtTail: Time Complexity: O(1) Space Complexity: O(1)
    addAtIndex: Time Complexity: O(n) Space Complexity: O(1)
    deleteAtIndex: Time Complexity: O(n) Space Complexity: O(1)
     */
    class MyLinkedList {
        ListNode head;
        ListNode tail;
        int size;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (index < 0 || index >= size) return -1;

            ListNode curr = head;

            for (int i = 0; i < index; i++) curr = curr.next;

            return curr.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            ListNode newHead = new ListNode(val, head);

            head = newHead;

            if (size == 0) tail = newHead;

            size++;

        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            ListNode newTail = new ListNode(val, null);

            if (size == 0) {
                tail = newTail;
                head = newTail;
            } else {
                tail.next = newTail;
                tail = newTail;
            }

            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) return;
            if (index == 0) {
                addAtHead(val);
                return;
            }
            if (index == size) {
                addAtTail(val);
                return;
            }

            ListNode curr = head;
            for (int i = 0; i < index - 1; i++) curr = curr.next;
            curr.next = new ListNode(val, curr.next);
            size++;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;
            if (index == 0) {
                head = head.next;
                size--;
                return;
            }

            ListNode curr = head;
            for (int i = 0; i < index - 1; i++) curr = curr.next;
            curr.next = curr.next.next;

            if (index == size - 1) {
                tail = curr;
            }
            size--;
        }

        private class ListNode {
            int val;
            ListNode next;

            public ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
/*
707. Design Linked List
 */
