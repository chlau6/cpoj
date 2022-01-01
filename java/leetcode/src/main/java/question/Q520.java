package question;

public class Q520 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean detectCapitalUse(String word) {
        int upperCaseCount = 0;
        int length = word.length();

        for (int i = 0; i < length; i++) {
            if (word.charAt(i) <= 'Z') {
                upperCaseCount++;
            }
        }

        return upperCaseCount == 0 || upperCaseCount == length || upperCaseCount == 1 && word.charAt(0) <= 'Z';
    }
}

/*
520. Detect Capital
 */
