package question;

import annotation.HashTable;
import annotation.SlidingWindow;
import annotation.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@HashTable
@Strings
@SlidingWindow
public class Q30 {
    /*
    Time Complexity: O(lmn)   Space Complexity: O(mn)
     */
    public List<Integer> findSubstring(String s, String[] words) {
        int l = s.length();
        int m = words.length;
        int n = words[0].length();
        int windows = l - m * n;

        Map<String, Integer> wordMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= windows; i++) {
            Map<String, Integer> countMap = new HashMap<>();

            int j;
            for (j = 0; j < m; j++) {
                int start = i + j * n;
                String w = s.substring(start, start + n);

                if (!wordMap.containsKey(w)) break;

                countMap.put(w, countMap.getOrDefault(w, 0) + 1);

                if (countMap.get(w) > wordMap.get(w)) break;
            }

            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }
}

/*
30. Substring with Concatenation of All Words
 */
