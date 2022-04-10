package question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Node parent = q.poll();

                currentLevel.add(parent.val);

                for (Node child : parent.children) {
                    q.add(child);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }

    ;

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}

/*
429. N-ary Tree Level Order Traversal
 */
