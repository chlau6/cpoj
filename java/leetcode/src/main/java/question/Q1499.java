package question;

import java.util.Deque;
import java.util.LinkedList;

public class Q1499 {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int result = Integer.MIN_VALUE;

        Deque<int[]> deque = new LinkedList<>();

        for (int[] point : points) {
            while (!deque.isEmpty() && deque.peekFirst()[0] < point[0] - k) {
                deque.removeFirst();
            }

            if (!deque.isEmpty()) {
                int[] first = deque.peekFirst();

                result = Math.max(result, point[0] + point[1] + first[1] - first[0]);
            }



            while (!deque.isEmpty() && point[1] - point[0] >= deque.peekLast()[1] - deque.peekLast()[0]) {
                deque.removeLast();
            }

            deque.addLast(point);
        }

        return result;
    }
}

/*
1499. Max Value of Equation
 */
