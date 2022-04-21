package question;

public class Q467 {
    public int findSubstringInWraproundString(String p) {
        int[] counts = new int[26];
        int n = p.length();
        int length = 0;
        char[] s = p.toCharArray();

        for (int i = 0; i < n; i++) {
            if (i > 0 && (s[i] == s[i - 1] + 1 || s[i - 1] - s[i] == 25)) {
                length++;
            } else {
                length = 1;
            }

            counts[s[i] - 'a'] = Math.max(counts[s[i] - 'a'], length);
        }

        int result = 0;

        for (int count : counts) {
            result += count;
        }

        return result;
    }
}

/*
467. Unique Substrings in Wraparound String
 */
