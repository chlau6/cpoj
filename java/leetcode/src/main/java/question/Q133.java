package question;

import java.util.*;

public class Q133 {
    /*
    DFS
    Time Complexity: O(V + E)   Space Complexity: (V + E)
     */
    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();
        return helper(node, map);
    }

    private Node helper(Node node, Map<Node, Node> map) {
        if (node == null) return null;

        if (map.containsKey(node)) return map.get(node);

        Node clone = new Node(node.val);
        map.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(helper(neighbor, map));
        }

        return clone;
    }

    /*
    BFS
    Time Complexity: O(V + E)   Space Complexity: O(V + E)
     */
    public Node cloneGraph2(Node node) {
        if (node == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        Node clone = new Node(node.val);
        Map<Node, Node> map = new HashMap<>();
        map.put(node, clone);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node n = queue.remove();

                for (Node neighbor : n.neighbors) {
                    if (!map.containsKey(neighbor)) {
                        map.put(neighbor, new Node(neighbor.val));
                        queue.add(neighbor);
                    }
                    map.get(n).neighbors.add(map.get(neighbor));
                }
            }
        }
        return clone;
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }
}

/*
133. Clone Graph
 */
