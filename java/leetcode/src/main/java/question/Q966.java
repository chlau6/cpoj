package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q966 {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> set = new HashSet<>();
        Map<String, String> lower = new HashMap<>();
        Map<String, String> replaceVowel = new HashMap<>();

        for (String w : wordlist) {
            String a = w.toLowerCase();
            String b = replace(a);

            set.add(w);
            lower.putIfAbsent(a, w);
            replaceVowel.putIfAbsent(b, w);
        }

        int n = queries.length;

        for (int i = 0; i < n; i++) {
            String s = queries[i];

            if (set.contains(s)) continue;

            String a = s.toLowerCase();
            String b = replace(a);

            if (lower.containsKey(a)) {
                queries[i] = lower.get(a);
            } else if (replaceVowel.containsKey(b)) {
                queries[i] = replaceVowel.get(b);
            } else {
                queries[i] = "";
            }
        }

        return queries;
    }

    public String replace(String s) {
        StringBuilder builder = new StringBuilder(s);
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                builder.setCharAt(i, '#');
            }
        }

        return builder.toString();
    }
}

/*
966. Vowel Spellchecker
 */
