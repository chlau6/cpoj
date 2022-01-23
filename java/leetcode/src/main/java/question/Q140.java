package question;

import java.util.*;

public class Q140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<String, List<String>> map = new HashMap<>();
        Set<String> set = new HashSet<>(wordDict);

        return helper(s, map, set);
    }

    private List<String> helper(String s, Map<String, List<String>> map, Set<String> set) {
        if (map.containsKey(s)) return map.get(s);
        if (s.isEmpty()) return List.of("");

        List<String> result = new ArrayList<>();
        for (String word : set) {
            if (!s.startsWith(word)) continue;

            List<String> memoization = helper(s.substring(s.length()), map, set);
            for (String mem : memoization) {
                result.add(word + (mem.length() == 0 ? "" : " ") + mem);
            }
        }
        map.put(s, result);

        return result;
    }
}

/*
140. Word Break II
 */
