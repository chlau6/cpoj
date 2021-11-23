package question;

import annotation.Strings;

@Strings
public class Q1880 {
    /*
    Time Complexity: O(m + n + o)   Space Complexity: O(1)
     */
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstSum = 0;
        int secondSum = 0;
        int targetSum = 0;
        int n1 = firstWord.length();
        int n2 = secondWord.length();
        int n3 = targetWord.length();

        for (int i = 0; i < n1; i++) {
            firstSum = firstSum * 10 + firstWord.charAt(i) - 'a';
        }

        for (int i = 0; i < n2; i++) {
            secondSum = secondSum * 10 + secondWord.charAt(i) - 'a';
        }

        for (int i = 0; i < n3; i++) {
            targetSum = targetSum * 10 + targetWord.charAt(i) - 'a';
        }

        return firstSum + secondSum == targetSum;
    }
}

/*
1880. Check if Word Equals Summation of Two Words
 */
