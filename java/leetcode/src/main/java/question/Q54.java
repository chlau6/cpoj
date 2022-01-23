package question;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (true) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            if (top > bot) break;

            for (int i = top; i <= bot; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (left > right) break;

            for (int i = right; i >= left; i--) {
                result.add(matrix[bot][i]);
            }
            bot--;
            if (top > bot) break;

            for (int i = bot; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            if (left > right) break;

        }

        return result;
    }
}

/*
54. Spiral Matrix
 */