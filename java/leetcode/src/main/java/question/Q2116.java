package question;

public class Q2116 {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1) return false;
        int n = s.length();

        for (int i = 0, balance = 0; i < n; i++) {
            if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) return false;
        }

        for (int i = n - 1, balance = 0; i >= 0; i--) {
            if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) return false;
        }

        return true;
    }
}

/*
2116. Check if a Parentheses String Can Be Valid
 */
