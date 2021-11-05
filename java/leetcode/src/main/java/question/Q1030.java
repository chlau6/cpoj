package question;

import annotation.*;

import java.util.Arrays;

@Array
@Maths
@Geometry
@Sorting
@Matrix
public class Q1030 {
    /*
    Time Complexity: O(mn log mn)   Space Complexity: O(mn)
     */
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                result[index][0] = i;
                result[index][1] = j;
            }
        }

        Arrays.sort(result, (a, b) -> Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter) - Math.abs(b[0] - rCenter) - Math.abs(b[1] - cCenter));

        return result;
    }
}

/*
1030. Matrix Cells in Distance Order
 */
