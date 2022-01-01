package question;

public class Q1051 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int heightChecker(int[] heights) {
        int[] counts = new int[101];

        for (int height : heights) {
            counts[height]++;
        }

        int j = 0;
        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            while (counts[j] == 0) j++;

            if (heights[i] != j) result++;

            counts[j]--;
        }

        return result;
    }
}

/*
1051. Height Checker
 */
