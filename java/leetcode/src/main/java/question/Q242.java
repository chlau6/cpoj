package question;

public class Q242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int[26];
        int length = s.length();

        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (--counts[c - 'a'] < 0) return false;
        }

        return true;
    }
}

/*
242. Valid Anagram
 */