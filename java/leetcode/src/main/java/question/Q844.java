package question;

import annotation.Simulation;
import annotation.Stacks;
import annotation.Strings;
import annotation.TwoPointers;

@TwoPointers
@Strings
@Stacks
@Simulation
public class Q844 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean backspaceCompare(String s, String t) {
        int count1 = 0;
        int count2 = 0;

        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            while (i >= 0 && (s.charAt(i) == '#' || count1 > 0)) {
                count1 += s.charAt(i--) == '#' ? 1 : -1;
            }

            while (j >= 0 && (t.charAt(j) == '#' || count2 > 0)) {
                count2 += t.charAt(j--) == '#' ? 1 : -1;
            }

            if (i < 0 || j < 0) return i == j;
            if (s.charAt(i--) != t.charAt(j--)) return false;
        }

        return i == j;
    }
}

/*
844. Backspace String Compare
 */
