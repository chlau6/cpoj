package question;

public class Q2259 {
    public String removeDigit(String number, char digit) {
        int n = number.length();

        for (int i = 0; i < n - 1; i++) {
            if (number.charAt(i) == digit && number.charAt(i + 1) > digit) {
                return number.substring(0, i) + number.substring(i + 1);
            }
        }

        int i = number.lastIndexOf(digit);

        return number.substring(0, i) + number.substring(i + 1);
    }
}

/*
2259. Remove Digit From Number to Maximize Result
 */
