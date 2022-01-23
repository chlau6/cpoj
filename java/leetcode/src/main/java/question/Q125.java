package question;

public class Q125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();

        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (!Character.isLetterOrDigit(c1)) {
                i++;
            } else if (!Character.isLetterOrDigit(c2)) {
                j--;
            } else if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
/*
125. Valid Palindrome
 */