package question;

import annotation.Maths;
import annotation.Strings;

@Maths
@Strings
public class Q171 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (char c : columnTitle.toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }

        return sum;
    }
}

/*
171. Excel Sheet Column Number
 */
