package question;

public class Q708 {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            head = new Node(insertVal, null);
            head.next = head;
            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != head) {
            if (prev.val <= insertVal && curr.val >= insertVal) break;
            if (prev.val > curr.val && (prev.val <= insertVal || curr.val >= insertVal)) break;
            prev = curr;
            curr = curr.next;
        }

        prev.next = new Node(insertVal, curr);
        return head;
    }

    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

/*
708. Insert into a Cyclic Sorted List
 */
