package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFS {
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

        DFS helper = new DFS();
        helper.dfs(node1);
    }

    public void dfs(Node node) {
        Set<Node> visited = new HashSet<>();

        dfs(visited, node);
    }

    public void dfs(Set<Node> visited, Node node) {
        if (node == null) return;

        visited.add(node);

        System.out.println(node.val);

        for (Node v : node.neighbors) {
            if (!visited.contains(v)) {
                dfs(visited, v);
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
