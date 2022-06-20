package question;

import java.util.*;

public class Q269 {
    public static void main(String[] args) {
        System.out.println(new Q269().alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}));
    }

    /*
    Kahn's Algorithm (Topological Sort)
     */
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> graph = new HashMap<>();
        int[] inDegrees = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!graph.containsKey(c)) {
                    graph.put(c, new HashSet<>());
                }
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int j;
            int limit = Math.min(s1.length(), s2.length());

            for (j = 0; j < limit; j++) {
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);

                if (c1 != c2) {
                    Set<Character> set = graph.get(c1);
                    if (!set.contains(c2)) {
                        inDegrees[c2 - 'a']++;
                        set.add(c2);
                        break;
                    }
                }
            }

            if (j == limit && s1.length() > s2.length()) return "";
        }

        StringBuilder order = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (char c : graph.keySet()) {
            if (inDegrees[c - 'a'] == 0) {
                q.offer(c);
            }
        }

        while (!q.isEmpty()) {
            char curr = q.poll();
            order.append(curr);
            for (char c : graph.get(curr)) {
                if (--inDegrees[c - 'a'] == 0) {
                    q.add(c);
                }
            }
        }

        return order.length() == graph.size() ? order.toString() : "";
    }
}

/*
269. Alien Dictionary
 */