package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q290 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        char[] p = pattern.toCharArray();
        String[] strs = s.split(" ");

        if (p.length != strs.length) return false;

        for (int i = 0; i < p.length; i++) {
            if (!map.containsKey(p[i])) {
                if (set.contains(strs[i])) return false;

                map.put(p[i], strs[i]);
                set.add(strs[i]);
            } else if (!map.get(p[i]).equals(strs[i])) {
                return false;
            }
        }

        return true;
    }
}

/*
290. Word Pattern
 */
