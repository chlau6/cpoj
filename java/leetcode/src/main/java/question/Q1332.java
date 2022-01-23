package question;

public class Q1332 {
    public int removePalindromeSub(String s) {
        boolean isPalindrome = true;

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        return isPalindrome ? 1 : 2;
    }
}

/*
1332. Remove Palindromic Subsequences
 */
