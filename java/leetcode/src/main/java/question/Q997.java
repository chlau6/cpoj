package question;

public class Q997 {
    public int findJudge(int n, int[][] trust) {
        int[] degree = new int[n + 1];

        for (int[] t : trust) {
            degree[t[0]]--;
            degree[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (degree[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}

/*
997. Find the Town Judge
 */
