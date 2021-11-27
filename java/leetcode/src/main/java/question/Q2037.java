package question;

import annotation.Array;
import annotation.Sorting;

import java.util.Arrays;

@Array
@Sorting
public class Q2037 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        int result = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            result += Math.abs(seats[i] - students[i]);
        }

        return result;
    }
}
/*
2037. Minimum Number of Moves to Seat Everyone
 */
