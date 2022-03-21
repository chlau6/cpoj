package question;

import java.util.*;

public class Q336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        int n = words.length;

        for (int i = 0; i < n; i++) {
            map.put(words[i], i);
            set.add(words[i].length());
        }

        for (int i = 0; i < n; i++) {
            String s = words[i];
            int len = s.length();

            s = reverse(s);

            // abcd dbca
            if (map.containsKey(s)) {
                int index = map.get(s);

                if (index != i) {
                    result.add(List.of(i, index));
                }
            }

            for (Integer l : set) {
                if (l == len) break;

                // abcd bcd
                if (isPalindrome(s, 0, len - l - 1)) {
                    String required = s.substring(len - l);

                    if (map.containsKey(required)) {
                        result.add(List.of(i, map.get(required)));
                    }
                }

                // dcb abcd
                if (isPalindrome(s, l, len - 1)) {
                    String required = s.substring(0, l);

                    if (map.containsKey(required)) {
                        result.add(List.of(map.get(required), i));
                    }
                }
            }
        }

        return result;
    }

    public String reverse(String s) {
        char[] str = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char temp = str[i];
            str[i++] = str[j];
            str[j--] = temp;
        }

        return new String(str);
    }

    public boolean isPalindrome(String word, int i, int j) {
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}

/*
336. Palindrome Pairs
 */
