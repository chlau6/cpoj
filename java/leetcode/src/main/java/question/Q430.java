package question;

public class Q430 {
    public Node flatten(Node head) {
        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                Node child = curr.child;

                while (child.next != null) {
                    child = child.next;
                }

                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;
                child.next = next;

                if (next != null) {
                    next.prev = child;
                }
            }

            curr = curr.next;
        }

        return head;
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
}
/*
430. Flatten a Multilevel Doubly Linked List
 */
