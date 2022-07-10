package question;

public class Q2186 {
    public int minSteps(String s, String t) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        int result = 0;
        for (int c : count) {
            result += Math.abs(c);
        }

        return result;
    }
}

/*
2186. Minimum Number of Steps to Make Two Strings Anagram II
 */
