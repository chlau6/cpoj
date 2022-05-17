package graph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        BFS helper = new BFS();
        helper.bfs(node1);
    }

    public void bfs(Node node) {
        if (node == null) return;

        Set<Node> visited = new HashSet<>();

        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited.add(node);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node currNode = q.poll();

                for (Node v : currNode.neighbors) {
                    if (!visited.contains(v)) {
                        visited.add(v);
                        q.add(v);
                    }
                }

                System.out.println(currNode.val);
            }
        }
    }

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
