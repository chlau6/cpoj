package question;

import annotation.Array;
import annotation.CountingSort;
import annotation.Sorting;

@Array
@Sorting
@CountingSort
public class Q1051 {
    /*
    Time Complexity: O(n)   Space Complexity: O(max(height))
     */
    public int heightChecker(int[] heights) {
        int[] bucket = new int[101];

        for (int height : heights) {
            bucket[height]++;
        }

        int index = 0;
        int mismatch = 0;

        for (int height : heights) {
            while (bucket[index] == 0) {
                index++;
            }

            if (index != height) {
                mismatch++;
            }
            bucket[index]--;
        }

        return mismatch;
    }
}

/*

 */
