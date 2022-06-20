package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q745 {
    class WordFilter {
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        public WordFilter(String[] words) {
            int n = words.length;
            for (int i = n - 1; i >= 0; i--) {
                String w = words[i];
                int l = w.length();

                if (set.contains(w)) continue;
                set.add(w);

                for (int j = 0; j <= 10 && j <= l; j++) {
                    for (int k = 0; k <= 10 && k <= l; k++) {
                        String prefixSuffix = w.substring(0, j) + "#" + w.substring(l - k);

                        if (map.containsKey(prefixSuffix)) continue;

                        map.put(prefixSuffix, i);
                    }
                }
            }
        }

        public int f(String prefix, String suffix) {
            return map.getOrDefault(prefix + "#" + suffix, -1);
        }
    }
}

/*
745. Prefix and Suffix Search
 */
