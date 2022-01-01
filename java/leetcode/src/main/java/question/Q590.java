package question;

import java.util.ArrayList;
import java.util.List;

public class Q590 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();

        postorder(root, list);

        return list;
    }

    public void postorder(Node root, List<Integer> list) {
        if (root == null) return;

        for (Node child : root.children) {
            postorder(child, list);
        }

        list.add(root.val);
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}

/*
590. N-ary Tree Postorder Traversal
 */
