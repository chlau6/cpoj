package question;

public class Q424 {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int result = 0;
        int start = 0;
        int maxCount = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            maxCount = Math.max(maxCount, ++counts[c - 'A']);

            while (i - start + 1 - maxCount > k) {
                char t = s.charAt(start);

                counts[t - 'A']--;
                start++;
            }

            result = Math.max(result, i - start + 1);
        }

        return result;
    }
}

/*
424. Longest Repeating Character Replacement
 */
