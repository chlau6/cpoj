package question;

public class Q58 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        int len = 0;

        while (end >= 0 && s.charAt(end) == ' ') end--;
        while (end >= 0 && s.charAt(end) != ' ') {
            end--;
            len++;
        }

        return len;
    }
}

/*
58. Length of Last Word
 */
