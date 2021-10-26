package question;

import annotation.Strings;

@Strings
public class Q434 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int countSegments(String s) {
        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') continue;

            count++;

            while (i < length && s.charAt(i) != ' ') i++;
        }

        return count;
    }
}
/*
434. Number of Segments in a String
 */
