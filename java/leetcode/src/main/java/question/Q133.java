package question;

import java.util.*;

public class Q133 {
    /*
    DFS
     */
    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();

        return helper(map, node);
    }

    private Node helper(Map<Node, Node> map, Node node) {
        if (node == null) return null;

        if (map.containsKey(node)) return map.get(node);

        Node copy = new Node(node.val);
        map.put(node, copy);

        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(helper(map, neighbor));
        }

        return copy;
    }

    /*
    BFS
     */
    public Node cloneGraph2(Node node) {
        if (node == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        Node copy = new Node(node.val);
        map.put(node, copy);

        queue.add(node);

        while (!queue.isEmpty()) {
            Node n = queue.remove();

            for (Node neighbor : n.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }

                map.get(n).neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
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
