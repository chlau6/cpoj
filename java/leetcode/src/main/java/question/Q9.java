package question;

public class Q9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) return false;

        int reversedHalfInteger = 0;

        while (x > reversedHalfInteger) {
            reversedHalfInteger = reversedHalfInteger * 10 + x % 10;
            x /= 10;
        }

        return reversedHalfInteger == x || reversedHalfInteger / 10 == x;
    }
}

/*
9. PalindromeNumber
 */
