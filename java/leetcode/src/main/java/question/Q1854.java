package question;

public class Q1854 {
    /*
    Line Sweep Algorithm
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int maximumPopulation(int[][] logs) {
        int[] count = new int[2051];
        int result = 0;

        for (int[] log : logs) {
            count[log[0]]++;
            count[log[1]]--;
        }

        for (int i = 1950; i < 2051; i++) {
            count[i] += count[i - 1];
            result = count[i] > count[result] ? i : result;
        }

        return result;
    }
}

/*
1854. Maximum Population Year
 */
