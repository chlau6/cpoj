package question;

public class Q65 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public boolean isNumber(String s) {
        int n = s.length();

        boolean dot = false;
        boolean e = false;
        boolean num = false;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = true;
            } else if (c == '.') {
                if (e || dot) return false;
                dot = true;
            } else if (c == 'e' || c == 'E') {
                if (e || !num) return false;
                e = true;
                num = false;
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } else {
                return false;
            }
        }

        return num;
    }
}

/*
64. Minimum Path Sum
 */
