package question;

public class Q273 {
    String[] lessThanTwenty = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        return helper(num).substring(1);
    }

    public String helper(int num) {
        if (num >= 1000000000) {
            return helper(num / 1000000000) + " Billion" + helper(num % 1000000000);
        } else if (num >= 1000000) {
            return helper(num / 1000000) + " Million" + helper(num % 1000000);
        } else if (num >= 1000) {
            return helper(num / 1000) + " Thousand" + helper(num % 1000);
        } else if (num >= 100) {
            return helper(num / 100) + " Hundred" + helper(num % 100);
        } else if (num >= 20) {
            return " " + tens[num / 10] + helper(num % 10);
        } else if (num >= 1) {
            return " " + lessThanTwenty[num];
        }

        return "";
    }
}

/*
273. Integer to English Words
 */
