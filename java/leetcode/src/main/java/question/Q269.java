package question;

import java.util.*;

public class Q269 {
    public static void main(String[] args) {
        System.out.println(new Q269().alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}));
    }

    /*
    Kahn's Algorithm (Topological Sort)
    Time Complexity: O(V + E)   Space Complexity: O(V)
     */
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<>();
        int[] inDegrees = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!map.containsKey(c)) {
                    map.put(c, new HashSet<>());
                }
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int j = 0;
            int limit = Math.min(s1.length(), s2.length());

            for (j = 0; j < limit; j++) {
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);

                if (c1 != c2) {
                    Set<Character> set = map.get(c1);
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

        for (char c : map.keySet()) {
            if (inDegrees[c - 'a'] == 0) {
                q.offer(c);
            }
        }

        while (!q.isEmpty()) {
            char curr = q.poll();
            order.append(curr);
            for (char c : map.get(curr)) {
                if (--inDegrees[c - 'a'] == 0) {
                    q.add(c);
                }
            }
        }

        return order.length() == map.size() ? order.toString() : "";
    }
}

/*
269. Alien Dictionary
 */