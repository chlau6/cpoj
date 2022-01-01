package question;

import java.util.ArrayList;
import java.util.List;

public class Q1428 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimension = binaryMatrix.dimension();

        int m = dimension.get(0);
        int n = dimension.get(1);
        int leftMost = -1;

        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (binaryMatrix.get(i, j) == 0) {
                i++;
            } else {
                leftMost = j--;
            }
        }

        return leftMost;
    }

    class BinaryMatrix {
        public int get(int x, int y) {
            return 0;
        }

        public List<Integer> dimension() {
            return new ArrayList<>();
        }
    }
}

/*
1428. Leftmost Column with at Least a One
 */
