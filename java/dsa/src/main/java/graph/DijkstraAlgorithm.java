package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static List<List<int[]>> generateGraph() {
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i <= 6; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new int[]{1, 4});
        graph.get(0).add(new int[]{2, 4});
        graph.get(1).add(new int[]{2, 2});
        graph.get(2).add(new int[]{3, 3});
        graph.get(2).add(new int[]{4, 1});
        graph.get(2).add(new int[]{5, 6});
        graph.get(3).add(new int[]{5, 2});
        graph.get(4).add(new int[]{5, 3});

        return graph;
    }

    public static void findPath(int[] parent, int x) {
        if (x != parent[x]) {
            findPath(parent, parent[x]);
        }

        System.out.println(x);
    }

    public static void main(String[] args) {
        List<List<int[]>> graph = generateGraph(); // source, [destination, weight]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        int n = graph.size();
        int[] dist = new int[n];
        int[] parent = new int[n];

        // from 0 to 5;

        int source = 0;

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        parent[source] = source;
        pq.add(new int[]{source, dist[source]});

        while (!pq.isEmpty()) {
            int[] v = pq.poll();

            int currNode = v[0];
            int currDist = v[1];

            for (int[] neighbor : graph.get(currNode)) {
                int neighborNode = neighbor[0];
                int neighborDist = neighbor[1];

                int newDist = currDist + neighborDist;

                if (newDist < dist[neighborNode]) {
                    dist[neighborNode] = newDist;
                    parent[neighborNode] = currNode;
                    pq.add(new int[]{neighborNode, newDist});
                }
            }
        }

        findPath(parent, 5);
    }
}
