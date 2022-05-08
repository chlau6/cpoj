package question;

public class Q1347 {
    public int minSteps(String s, String t) {
        int n = s.length();
        int[] count = new int[26];
        int result = 0;

        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            count[c1 - 'a']++;
            count[c2 - 'a']--;
        }

        for (int c : count) {
            if (c > 0) {
                result += c;
            }
        }

        return result;
    }
}

/*
1347. Minimum Number of Steps to Make Two Strings Anagram
 */
