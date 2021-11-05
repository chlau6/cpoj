package question;

import annotation.*;

@Array
@Maths
@TwoPointers
@Strings
@Greedy
public class Q942 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public int[] diStringMatch(String s) {
        int length = s.length();
        int minValue = 0;
        int maxValue = length;
        int[] result = new int[length + 1];

        int i;

        for (i = 0; i < length; i++) {
            char c = s.charAt(i);
            result[i] = (c == 'I') ? minValue++ : maxValue--;
        }

        result[i] = maxValue;

        return result;
    }
}

/*
942. DI String Match
 */
