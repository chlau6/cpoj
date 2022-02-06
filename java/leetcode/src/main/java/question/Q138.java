package question;

import java.util.HashMap;
import java.util.Map;

public class Q138 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node dummy = head;

        while (dummy != null) {
            map.put(dummy, new Node(dummy.val));
            dummy = dummy.next;
        }

        dummy = head;

        while (dummy != null) {
            Node node = map.get(dummy);
            node.next = map.get(dummy.next);
            node.random = map.get(dummy.random);
            dummy = dummy.next;
        }

        return map.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

/*
138. Copy List with Random Pointer
 */
