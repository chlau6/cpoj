package question;

public class Q1876 {
    public int countGoodSubstrings(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int result = 0;

        for (int i = 1; i < n - 1; i++) {
            if (str[i] != str[i - 1] && str[i] != str[i + 1] && str[i - 1] != str[i + 1]) {
                result++;
            }
        }

        return result;
    }
}

/*
1876. Substrings of Size Three with Distinct Characters
 */
