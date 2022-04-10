package question;

public class Q420 {
    public int strongPasswordChecker(String s) {
        char[] str = s.toCharArray();
        int n = s.length();

        int requiredChar = charTypeMiss(str);

        if (n < 6) {
            return Math.max(requiredChar, 6 - n);
        }

        // only need replacement and deletion now when s.Length >= 6
        int replace = 0; // total replacements for repeated chars. e.g. "aaa" needs 1 replacement to fix
        int oneDeletion = 0; // total deletions for 3n repeated chars. e.g. "aaa" needs 1 deletion to fix
        int twoDeletion = 0; // total deletions for 3n+1 repeated chars. e.g. "aaaa" needs 2 deletions to fix.
        int i = 0;

        while (i < n) {
            int l = 1; // repeated len
            while (i + l < n && str[i + l] == str[i + l - 1]) {
                l++;
            }

            if (l >= 3) {
                replace += l / 3;
                if (l % 3 == 0) {
                    oneDeletion += 1;
                } else if (l % 3 == 1) {
                    twoDeletion += 2;
                }
            }

            i += l;
        }

        // no need deletion when s.Length <= 20
        if (n <= 20) return Math.max(requiredChar, replace);

        int deleteCount = n - 20;

        // deleting 1 char in (3n) repeated chars will save one replacement
        replace -= Math.min(deleteCount, oneDeletion);

        // deleting 2 chars in (3n+1) repeated chars will save one replacement
        replace -= Math.min(Math.max(deleteCount - oneDeletion, 0), twoDeletion) / 2;

        // deleting 3 chars in (3n+2) repeated chars will save one replacement
        replace -= Math.max(deleteCount - oneDeletion - twoDeletion, 0) / 3;

        return deleteCount + Math.max(requiredChar, replace);
    }

    private int charTypeMiss(char[] s) {
        int lowercase = 1;
        int uppercase = 1;
        int digit = 1;

        for (char c : s) {
            if (Character.isLowerCase(c)) {
                lowercase = 0;
            } else if (Character.isUpperCase(c)) {
                uppercase = 0;
            } else if (Character.isDigit(c)) {
                digit = 0;
            }
        }

        return lowercase + uppercase + digit;
    }
}

/*
420. Strong Password Checker
 */
