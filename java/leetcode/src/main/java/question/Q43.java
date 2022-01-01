package question;

public class Q43 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(m + n)
     */
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] digits = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int multiple = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p2 = i + j + 1;
                int p1 = i + j;

                int sum = multiple + digits[p2];
                digits[p2] = sum % 10;
                digits[p1] += sum / 10;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int d : digits) {
            if (result.length() > 0 || d > 0) {
                result.append(d);
            }
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}

/*
43. Multiply Strings
 */
