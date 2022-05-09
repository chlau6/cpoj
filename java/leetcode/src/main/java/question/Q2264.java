package question;

public class Q2264 {
    public String largestGoodInteger(String num) {
        int n = num.length();
        char[] s = num.toCharArray();
        char result = 0;

        for (int i = 0; i < n - 2; i++) {
            if (s[i] == s[i + 1] && s[i + 1] == s[i + 2]) {
                result = (char) Math.max(result, s[i]);
            }
        }

        return result == 0 ? "" : String.valueOf(new char[]{result, result, result});
    }
}

/*
2264. Largest 3-Same-Digit Number in String
 */
