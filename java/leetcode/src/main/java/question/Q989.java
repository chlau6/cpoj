package question;

import annotation.Array;
import annotation.Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Array
@Maths
public class Q989 {
    /*
    DFS
    Time Complexity: O(n) Space Complexity: O(n)
     */
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            k += num[i];
            result.add(k % 10);
            k /= 10;
        }

        while (k > 0) {
            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);

        return result;
    }
}

/*
989. Add to Array-Form of Integer
 */
