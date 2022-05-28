package question;

public class Q1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];

        for (int[] b : bookings) {
            result[b[0] - 1] += b[2];

            if (b[1] < n) {
                result[b[1]] -= b[2];
            }
        }

        for (int i = 1; i < n; i++) {
            result[i] += result[i - 1];
        }

        return result;
    }
}

/*
1109. Corporate Flight Bookings
 */
