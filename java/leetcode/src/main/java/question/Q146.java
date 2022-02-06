package question;

import java.util.HashMap;
import java.util.Map;

public class Q146 {
    class LRUCache {
        Map<Integer, Node> cache = new HashMap<>();
        int maxCapacity;
        Node head;
        Node tail;

        public LRUCache(int capacity) {
            maxCapacity = capacity;
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.prev = null;
            head.next = tail;
            tail.prev = head;
            tail.next = null;
        }

        public void delete(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        public void add(Node node) {
            node.next = head.next;
            node.next.prev = node;
            head.next = node;
            node.prev = head;
        }

        public int get(int key) {
            if (!cache.containsKey(key)) return -1;

            Node node = cache.get(key);
            delete(node);
            add(node);
            return node.val;
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                node.val = value;
                delete(node);
                add(node);
            } else {
                Node newNode = new Node(key, value);
                cache.put(key, newNode);
                add(newNode);
            }

            if (cache.size() > maxCapacity) {
                Node oldNode = tail.prev;
                cache.remove(oldNode.key);
                delete(oldNode);
            }
        }
    }

    class Node {
        public int key;
        public int val;
        public Node prev;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

/*
146. LRU Cache
 */
