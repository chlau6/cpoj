package question;

import java.util.List;

public class Q524 {
    public String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort((a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());

        for (String str : dictionary) {
            int i = 0;
            int n = str.length();

            for (char c : s.toCharArray()) {
                if (str.charAt(i) == c) {
                    i++;
                }

                if (i == n) return str;
            }
        }

        return "";
    }
}

/*
524. Longest Word in Dictionary through Deleting
 */
