package question;

import annotation.Maths;
import annotation.Stacks;
import annotation.Strings;
import company.Facebook;

@Maths
@Strings
@Stacks
@Facebook
public class Q273 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */

    String[] lessThan20 = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num).toString().trim();
    }

    private String helper(int num) {
        if (num >= 1000000000) {
            return helper(num / 1000000000) + " Billion " + helper(num % 1000000000);
        } else if (num >= 1000000) {
            return helper(num / 1000000) + " Million " + helper(num % 1000000);
        } else if (num >= 1000) {
            return helper(num / 1000) + " Thousand " + helper(num % 1000);
        } else if (num >= 100) {
            return (helper(num / 100) + " Hundred " + helper(num % 100)).trim();
        } else if (num >= 20) {
            return (tens[num / 10] + " " + helper(num % 10)).trim();
        }
        return lessThan20[num];
    }
}

/*
227. Basic Calculator II
 */
