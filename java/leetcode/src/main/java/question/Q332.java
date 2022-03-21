package question;

import java.util.*;

public class Q332 {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (List<String> ticket : tickets) {
            if (!graph.containsKey(ticket.get(0))) {
                graph.put(ticket.get(0), new PriorityQueue<>());
            }

            graph.get(ticket.get(0)).add(ticket.get(1));
        }

        dfs(graph, result, "JFK");

        Collections.reverse(result);

        return result;
    }

    public void dfs(Map<String, PriorityQueue<String>> graph, List<String> result, String airport) {
        while (graph.containsKey(airport) && !graph.get(airport).isEmpty()) {
            dfs(graph, result, graph.get(airport).poll());
        }

        result.add(airport);
    }
}

/*
332. Reconstruct Itinerary
 */
