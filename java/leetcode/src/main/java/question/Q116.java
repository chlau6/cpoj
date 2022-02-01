package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q116 {
    /*
    BFS
     */
    public Node connect(Node root) {
        if (root == null) return null;

        Node node = root;

        while (node.left != null) {
            Node parent = node;

            while (parent != null) {
                parent.left.next = parent.right;

                if (parent.next != null) {
                    parent.right.next = parent.next.left;
                }
                parent = parent.next;

            }

            node = node.left;
        }

        return root;
    }

    /*
    DFS
     */
    public Node connect2(Node root) {
        if (root == null) return null;

        if (root.left != null) {
            root.left.next = root.right;
        }

        if (root.right != null) {
            root.right.next = (root.next != null) ? root.next.left : null;
        }

        connect(root.left);
        connect(root.right);

        return root;
    }

    /*
    Queue
     */
    public Node connect3(Node root) {
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
