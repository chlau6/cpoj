package question;

public class Q67 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String addBinary(String a, String b) {
        var builder = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            sum += i >= 0 ? a.charAt(i--) - '0' : 0;
            sum += j >= 0 ? b.charAt(j--) - '0' : 0;

            builder.append(sum % 2);
            carry = sum / 2;
        }

        return builder.reverse().toString();
    }
}

/*
67. Add Binary
 */
