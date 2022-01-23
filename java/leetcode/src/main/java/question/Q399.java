package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Q399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);

            graph.putIfAbsent(u, new HashMap<>());
            graph.get(u).put(v, values[i]);
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(v).put(u, 1 / values[i]);
        }

        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            results[i] = helper(queries.get(i).get(0), queries.get(i).get(1), new HashSet<>(), graph);
        }

        return results;
    }

    private double helper(String from, String to, HashSet<String> visited, Map<String, Map<String, Double>> graph) {
        if (!graph.containsKey(from)) return -1.0;

        if (graph.get(from).containsKey(to)) {
            return graph.get(from).get(to);
        }

        visited.add(from);

        for (Map.Entry<String, Double> neighbour : graph.get(from).entrySet()) {
            if (!visited.contains(neighbour.getKey())) {
                double product = helper(neighbour.getKey(), to, visited, graph);
                if (product != -1.0) {
                    return neighbour.getValue() * product;
                }
            }
        }
        return -1.0;
    }
}

/*
399. Evaluate Division
 */
