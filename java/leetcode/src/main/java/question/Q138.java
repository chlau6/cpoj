package question;

import annotation.HashTable;
import annotation.LinkedLists;

import java.util.HashMap;
import java.util.Map;

@HashTable
@LinkedLists
public class Q138 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node pointer = head;

        while (pointer != null) {
            Node deepCopy = new Node(pointer.val);
            map.put(pointer, deepCopy);

            pointer = pointer.next;
        }

        Node dummy = new Node(-1);
        pointer = dummy;

        while (head != null) {
            Node newNode = map.get(head);
            newNode.next = map.get(head.next);
            newNode.random = map.get(head.random);

            pointer.next = newNode;
            pointer = pointer.next;
            head = head.next;
        }

        return dummy.next;
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
