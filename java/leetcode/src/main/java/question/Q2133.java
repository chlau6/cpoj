package question;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Q2133 {
    /*
    BitSet
     */
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            BitSet row = new BitSet(n + 1);
            BitSet col = new BitSet(n + 1);

            for (int j = 0; j < n; j++) {
                if (row.get(matrix[i][j]) || col.get(matrix[j][i])) {
                    return false;
                }

                row.set(matrix[i][j]);
                col.set(matrix[j][i]);
            }
        }

        return true;
    }

    /*
    HashSet
     */
    public boolean checkValid2(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (!row.add(matrix[i][j]) || !col.add(matrix[j][i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
/*
2133. Check if Every Row and Column Contains All Numbers
 */
