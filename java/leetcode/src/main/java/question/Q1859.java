package question;

import annotation.Sorting;
import annotation.Strings;

import java.util.Map;
import java.util.TreeMap;

@Strings
@Sorting
public class Q1859 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public String sortSentence(String s) {
        Map<Integer, String> map = new TreeMap<>();
        int n = s.length();

        int start = 0;
        int i;
        for (i = 0; i <= n; i++) {
            if (i == n || s.charAt(i) == ' ') {
                map.put(s.charAt(i - 1) - '0', s.substring(start, i - 1));
                start = i + 1;
            }
        }

        var builder = new StringBuilder();

        for (String value : map.values()) {
            if (builder.length() > 0) {
                builder.append(' ');
            }

            builder.append(value);
        }

        return builder.toString();
    }
}

/*
1859. Sorting the Sentence
 */
