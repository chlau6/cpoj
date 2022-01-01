package question;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q559 {
    /*
    Time Complexity: O(n)   Space Complexity: O(w)
     */
    public int maxDepth(Node root) {
        if (root == null) return 0;

        int depth = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            depth++;

            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                for (Node child : node.children) {
                    q.add(child);
                }
            }
        }

        return depth;
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
559. Maximum Depth of N-ary Tree
 */
