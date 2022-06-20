package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q676 {
    class MagicDictionary {
        Map<Integer, Set<String>> map = new HashMap<>();

        public MagicDictionary() {

        }

        public void buildDict(String[] dictionary) {
            for (String w : dictionary) {
                int n = w.length();

                map.putIfAbsent(n, new HashSet<>());
                map.get(n).add(w);
            }
        }

        public boolean search(String searchWord) {
            int n = searchWord.length();

            if (!map.containsKey(n)) return false;

            Set<String> candidate = map.get(n);

            for (String w : candidate) {
                if (isOneDiff(searchWord, w)) return true;
            }

            return false;
        }

        public boolean isOneDiff(String a, String b) {
            int n = a.length();
            int diff = 0;

            for (int i = 0; i < n; i++) {
                if (a.charAt(i) != b.charAt(i) && ++diff > 1) {
                    return false;
                }
            }

            return diff == 1;
        }
    }
}

/*
676. Implement Magic Dictionary
 */
