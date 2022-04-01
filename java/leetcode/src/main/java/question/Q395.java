package question;

public class Q395 {
    public int longestSubstring(String s, int k) {
        int result = 0;
        char[] c = s.toCharArray();
        int n = c.length;

        for (int count = 1; count <= 26; count++) {
            int[] bucket = new int[26];
            int start = 0;
            int uniqueCount = 0;
            int i = 0;


            while (i < n) {
                boolean valid = true;

                if (bucket[c[i++] - 'a']++ == 0) {
                    uniqueCount++;
                }

                while (uniqueCount > count) {
                    if (--bucket[c[start++] - 'a'] == 0) {
                        uniqueCount--;
                    }
                }

                for (int j = 0; j < 26; j++) {
                    if (bucket[j] > 0 && bucket[j] < k) {
                        valid = false;
                    }
                }

                if (valid) {
                    result = Math.max(result, i - start);
                }
            }
        }

        return result;
    }
}

/*
395. Longest Substring with At Least K Repeating Characters
 */
