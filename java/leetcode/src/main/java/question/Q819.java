package question;

import java.util.*;

public class Q819 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(m + n)
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(banned));

        String result = "";
        int max = 0;

        for (String word : words) {
            int freq = map.getOrDefault(word, 0) + 1;
            map.put(word, freq);

            if (!set.contains(word) && freq > max) {
                result = word;
                max = freq;
            }
        }

        return result;
    }
}

/*
819. Most Common Word
 */
