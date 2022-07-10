package question;

import java.util.HashMap;
import java.util.Map;

public class Q833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = indices.length;
        int n = s.length();

        for (int i = 0; i < m; i++) {
            String sub = s.substring(indices[i], Math.min(n, indices[i] + sources[i].length()));

            if (sub.equals(sources[i])) {
                map.put(indices[i], i);
            }
        }

        StringBuilder builder = new StringBuilder();
        int i = 0;

        while (i < n) {
            if (map.containsKey(i)) {
                int pos = map.get(i);
                builder.append(targets[pos]);
                i += sources[pos].length();
            } else {
                builder.append(s.charAt(i++));
            }
        }

        return builder.toString();
    }
}

/*
833. Find And Replace in String
 */
