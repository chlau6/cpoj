
package question;

import java.util.HashMap;
import java.util.Map;

public class Q2085 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(n)
     */
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        int result = 0;

        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            int count = map.getOrDefault(word, 0);

            if (count < 2) {
                map.put(word, --count);
            }
        }

        for (int val : map.values()) {
            if (val == 0) {
                result++;
            }
        }

        return result;
    }
}
/*
2085. Count Common Words With One Occurrence
 */
