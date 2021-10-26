package question;

import annotation.Array;
import annotation.Greedy;
import annotation.Sorting;

import java.util.Arrays;

@Array
@Greedy
@Sorting
public class Q455 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                j++;
            }
            i++;
        }

        return j;
    }
}

/*
455. Assign Cookies
 */
