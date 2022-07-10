package question;

public class Q707 {
    class MyLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        public MyLinkedList() {
            head = tail;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }

            Node dummy = head;

            for (int i = 0; i < index; i++) {
                dummy = dummy.next;
            }

            return dummy.val;
        }

        public void addAtHead(int val) {
            Node node = new Node(val, head);

            head = node;

            if (size == 0) {
                tail = node;
            }

            size++;
        }

        public void addAtTail(int val) {
            Node node = new Node(val, null);

            if (size == 0) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index > size) return;

            if (index <= 0) {
                addAtHead(val);
                return;
            }

            if (index == size) {
                addAtTail(val);
                return;
            }

            Node dummy = head;

            for (int i = 0; i < index - 1; i++) {
                dummy = dummy.next;
            }

            Node node = new Node(val, dummy.next);
            dummy.next = node;

            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;

            if (index == 0) {
                head = head.next;
                size--;
                return;
            }

            Node dummy = head;

            for (int i = 0; i < index - 1; i++) {
                dummy = dummy.next;
            }

            dummy.next = dummy.next.next;

            if (index == size - 1) {
                tail = dummy;
            }

            size--;
        }

        class Node {
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
/*
707. Design Linked List
 */
