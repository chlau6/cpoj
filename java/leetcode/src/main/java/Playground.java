import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Playground {
    public static boolean isNegativeCycle(int[][] graph) {
        int n = graph.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (graph[i][k] + graph[k][j] < graph[i][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];

                        if (graph[i][j] < 0) return true;
                    }
                }
            }
        }

        return false;
    }

    private static int[] allBunnies(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = i;
        }

        return result;
    }

    public static int[] solution(int[][] times, int times_limit) {
        int n = times.length;
        if (isNegativeCycle(times)) {
            return allBunnies(n - 2);
        }

        List<Integer> resultList = new ArrayList<>();
        boolean[] visited = new boolean[n];
        visited[0] = true;

        for (int i = 1; i < n - 1; i++) {
            dfs(resultList, new ArrayList<>(), times, visited, times_limit - times[0][i], i);
        }

        if (resultList.size() == 0) {
            return new int[]{};
        }

        int[] result = resultList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);

        return result;
    }

    public static void dfs(List<Integer> result, List<Integer> list, int[][] graph, boolean[] visited, int time, int i) {
        int n = graph.length;

        if (visited[i] || time <= -999 || (i == n - 1 && time < 0) || result.size() == n - 2) {
            return;
        }

        if (time >= 0 && i == n - 1) {
            if (list.size() > result.size()) {
                result = new ArrayList<>(list);
            }

            return;
        }

        visited[i] = true;
        list.add(i - 1);

        for (int j = 1; j < n; ++j) {
            if (i == j) continue;
            dfs(result, list, graph, visited, time - graph[i][j], j);
        }

        list.remove(list.size() - 1);
        visited[i] = false;
    }
}