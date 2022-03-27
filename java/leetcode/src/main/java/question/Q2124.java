package question;

public class Q2124 {
    public boolean checkString(String s) {
        int n = s.length() - 1;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
/*
2124. Check if All A's Appears Before All B's
 */
