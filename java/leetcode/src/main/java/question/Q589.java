package question;

import java.util.ArrayList;
import java.util.List;

public class Q589 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        preorder(root, list);

        return list;
    }

    public void preorder(Node root, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);

        for (Node child : root.children) {
            preorder(child, list);
        }
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
589. N-ary Tree Preorder Traversal
 */
