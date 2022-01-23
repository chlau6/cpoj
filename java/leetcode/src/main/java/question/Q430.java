package question;

public class Q430 {
    public Node flatten(Node head) {
        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                Node last = curr.child;

                while (last.next != null) last = last.next;
                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;
                last.next = next;

                if (next != null) next.prev = last;
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
