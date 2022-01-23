package question;

public class Q1967 {
    public int numOfStrings(String[] patterns, String word) {
        int result = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) result++;
        }

        return result;
    }
}
/*
1967. Number of Strings That Appear as Substrings in Word
 */
