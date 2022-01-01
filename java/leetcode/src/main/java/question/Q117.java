package question;

public class Q117 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public Node connect(Node root) {
        if (root == null) return null;

        Node dummy = new Node(0);
        Node curr = dummy;
        Node head = root;

        while (root != null) {
            if (root.left != null) {
                curr.next = root.left;
                curr = curr.next;
            }

            if (root.right != null) {
                curr.next = root.right;
                curr = curr.next;
            }

            root = root.next;
            if (root == null) {
                curr = dummy;
                root = dummy.next;
                dummy.next = null;
            }
        }
        return head;
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
117. Populating Next Right Pointers in Each Node II
 */
