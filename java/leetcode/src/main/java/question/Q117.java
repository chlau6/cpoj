package question;

public class Q117 {
    public Node connect(Node root) {
        Node node = root;
        Node dummy = new Node(-1);
        Node dummyHead = dummy;

        while (node != null) {
            if (node.left != null) {
                dummy.next = node.left;
                dummy = dummy.next;
            }

            if (node.right != null) {
                dummy.next = node.right;
                dummy = dummy.next;
            }

            node = node.next;

            if (node == null) {
                node = dummyHead.next;
                dummy = dummyHead;
                dummy.next = null;
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
117. Populating Next Right Pointers in Each Node II
 */
