package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isMatch(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    public boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length()) return false;

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        int n = word.length();

        for (int i = 0; i < n; i++) {
            char c1 = word.charAt(i);
            char c2 = pattern.charAt(i);

            if (!m1.containsKey(c1)) {
                m1.put(c1, c2);
            }

            if (!m2.containsKey(c2)) {
                m2.put(c2, c1);
            }

            if (m1.get(c1) != c2 || m2.get(c2) != c1) return false;
        }

        return true;
    }
}

/*
890. Find and Replace Pattern
 */
