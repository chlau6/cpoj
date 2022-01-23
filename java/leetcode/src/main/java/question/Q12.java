package question;

public class Q12 {
    public String intToRoman(int num) {
        String[] digits = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = new String[]{"", "M", "MM", "MMM"};

        return thousands[num / 1000] + hundreds[num / 100 % 10] + tens[num / 10 % 10] + digits[num % 10];
    }
}

/*
12. Integer to Roman
 */
