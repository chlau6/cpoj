package question;

public class Q1483 {
    class TreeAncestor {
        int[][] jump;
        int maxPow;

        public TreeAncestor(int n, int[] parent) {
            maxPow = (int) (Math.log(n) / Math.log(2)) + 1;
            jump = new int[maxPow][n];
            jump[0] = parent;

            for (int i = 1; i < maxPow; i++) {
                for (int j = 0; j < n; j++) {
                    int prev = jump[i - 1][j];
                    jump[i][j] = prev == -1 ? -1 : jump[i - 1][prev];
                }
            }
        }

        public int getKthAncestor(int node, int k) {
            int maxPow = this.maxPow;

            while (k > 0 && node > -1) {
                if (k >= 1 << maxPow) {
                    node = jump[maxPow][node];
                    k -= 1 << maxPow;
                } else {
                    maxPow--;
                }
            }

            return node;
        }
    }
}

/*
1483. Kth Ancestor of a Tree Node
 */
