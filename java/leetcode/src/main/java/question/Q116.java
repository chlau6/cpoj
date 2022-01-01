package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q116 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public Node connect(Node root) {
        if (root == null) return null;
        Node prev = root;
        Node curr;

        while (prev.left != null) {
            curr = prev;
            while (curr != null) {
                curr.left.next = curr.right;
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            prev = prev.left;
        }
        return root;
    }

    /*
    Queue
    Time Complexity: O(n)   Space Complexity: O(w)
     */
    public Node connect2(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                node.next = i == size - 1 ? null : queue.peek();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
}

/*
116. Populating Next Right Pointers in Each Node
 */
