package question;

import java.util.Arrays;

public class Q2037 {
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
