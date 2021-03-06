package question;

import java.util.ArrayList;
import java.util.List;

public class Q1548 {
    String[] names;
    String[] targetPath;
    int[][] cost;
    int[][] next;
    List<List<Integer>> graph = new ArrayList<>();

    public List<Integer> mostSimilar(int n, int[][] roads, String[] names, String[] targetPath) {
        this.names = names;
        this.targetPath = targetPath;
        // cost[i][j] = min cost to start from names[i] in path[j]
        this.cost = new int[names.length][targetPath.length];
        // next[i][j] = best next of names[i] in path[j]
        this.next = new int[names.length][targetPath.length];

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }

        int minDist = Integer.MAX_VALUE;
        int start = 0;

        // start from different names
        for (int i = 0; i < names.length; ++i) {
            int dist = dfs(i, 0);
            if (dist < minDist) {
                minDist = dist;
                start = i;
            }
        }

        List<Integer> result = new ArrayList<>();

        while (result.size() < targetPath.length) {
            result.add(start);
            start = next[start][result.size() - 1];
        }

        return result;
    }

    private int dfs(int nameIndex, int pathIndex) {
        if (cost[nameIndex][pathIndex] != -1)
            return cost[nameIndex][pathIndex];

        int editDist = names[nameIndex].equals(targetPath[pathIndex]) ? 0 : 1;
        if (pathIndex == targetPath.length - 1)
            return editDist;

        int minDist = Integer.MAX_VALUE;

        for (int v : graph.get(nameIndex)) {
            int dist = dfs(v, pathIndex + 1);
            if (dist < minDist) {
                minDist = dist;
                next[nameIndex][pathIndex] = v;
            }
        }

        return cost[nameIndex][pathIndex] = editDist + minDist;
    }
}

/*
1548. The Most Similar Path in a Graph
 */
