
package question;

import annotation.StringMatching;
import annotation.Strings;

@Strings
@StringMatching
public class Q1668 {
    /*
    Time Complexity: O(n^3)   Space Complexity: O(n)
     */
    public int maxRepeating(String sequence, String word) {
        var builder = new StringBuilder(word);
        int result = 1;

        while (sequence.contains(builder)) {
            builder.append(word);
            result++;
        }

        return result - 1;
    }
}

/*
1668. Maximum Repeating Substring
 */
