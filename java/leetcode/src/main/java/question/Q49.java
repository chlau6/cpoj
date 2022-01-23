package question;

import java.util.*;

public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();

            Arrays.sort(chars);
            String s = String.valueOf(chars);

            map.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

/*
49. Group Anagrams
 */
