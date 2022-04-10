package question;

import java.util.*;

public class Q399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        int m = equations.size();
        int n = queries.size();
        double[] results = new double[n];

        for (int i = 0; i < m; i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);

            graph.putIfAbsent(u, new HashMap<>());
            graph.get(u).put(v, values[i]);
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(v).put(u, 1 / values[i]);
        }


        for (int i = 0; i < n; i++) {
            String from = queries.get(i).get(0);
            String to = queries.get(i).get(1);

            results[i] = helper(graph, new HashSet<>(), from, to);
        }

        return results;
    }

    private double helper(Map<String, Map<String, Double>> graph, Set<String> visited, String from, String to) {
        if (!graph.containsKey(from)) return -1.0;

        if (graph.get(from).containsKey(to)) {
            return graph.get(from).get(to);
        }

        visited.add(from);

        for (Map.Entry<String, Double> neighbour : graph.get(from).entrySet()) {
            String key = neighbour.getKey();
            Double value = neighbour.getValue();

            if (visited.contains(key)) continue;

            double product = helper(graph, visited, key, to);
            if (product != -1.0) {
                return value * product;
            }
        }

        return -1.0;
    }
}

/*
399. Evaluate Division
 */
