package question;

import annotation.Array;
import annotation.Matrix;
import annotation.Simulation;

import java.util.ArrayList;
import java.util.List;

@Array
@Matrix
@Simulation
public class Q54 {
    public static void main(String[] args) {
        System.out.println(new Q54().bordersSum(new int[][]{{9, 7, 4, 5},
                {1, 6, 2, -6},
                {12, 20, 2, 0},
                {-5, -6, 7, -2}}));
    }

    /*
    Variation: n * n matrix, calculate the border sum
    Time Complexity: O(mn)  Space Complexity: O(n)
     */

    /*
    Time Complexity: O(mn)  Space Complexity: O(mn)
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        List<Integer> list = new ArrayList<>();
        while (true) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) break;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (left > right) break;

            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if (top > bottom) break;

            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (left > right) break;
        }

        return list;
    }

    public List<Integer> bordersSum(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        List<Integer> list = new ArrayList<>();
        while (true) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += matrix[top][i];
            }
            top++;
            if (top > bottom) {
                list.add(sum);
                break;
            }

            for (int i = top; i <= bottom; i++) {
                sum += matrix[i][right];
            }
            right--;
            if (left > right) {
                list.add(sum);
                break;
            }

            for (int i = right; i >= left; i--) {
                sum += matrix[bottom][i];
            }
            bottom--;
            if (top > bottom) {
                list.add(sum);
                break;
            }

            for (int i = bottom; i >= top; i--) {
                sum += matrix[i][left];
            }
            left++;
            if (left > right) {
                list.add(sum);
                break;
            }

            list.add(sum);
        }

        return list;
    }
}

/*
54. Spiral Matrix
 */