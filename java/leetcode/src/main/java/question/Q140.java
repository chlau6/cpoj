package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<String, List<String>> map = new HashMap<>();

        return helper(map, wordDict, s);
    }

    public List<String> helper(Map<String, List<String>> map, List<String> wordDict, String s) {
        if (map.containsKey(s)) return map.get(s);
        if (s.isEmpty()) return List.of("");

        List<String> result = new ArrayList<>();

        for (String word : wordDict) {
            int n = word.length();

            if (!s.startsWith(word)) continue;

            List<String> subList = helper(map, wordDict, s.substring(n));

            for (String sub : subList) {
                result.add(word + (sub.isEmpty() ? "" : " ") + sub);
            }
        }

        map.put(s, result);

        return result;
    }
}

/*
140. Word Break II
 */
