package question;

public class Q1071 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(n)
     */
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int divisor = gcd(str1.length(), str2.length());

        return str1.substring(0, divisor);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}

/*
1071. Greatest Common Divisor of Strings
 */
