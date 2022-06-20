package question;

public class Q552 {
    public int checkRecord(int n) {
        int m = 1000000007;

        long[] prevState = new long[]{1L, 1L, 0L, 1L, 0L, 0L, 0L};

        for (int i = 2; i <= n; i++) {
            long[] currState = new long[7];

            currState[0] = (prevState[1] + prevState[3] + prevState[5]) % m;

            currState[1] = (prevState[1] + prevState[3] + prevState[5]) % m;

            currState[2] = (prevState[0] + prevState[2] + prevState[4] + prevState[6]) % m;

            currState[3] = prevState[1];

            currState[4] = (prevState[0] + prevState[2]) % m;

            currState[5] = prevState[3];

            currState[6] = prevState[4];

            prevState = currState;
        }

        long result = 0;

        for (long v : prevState) {
            result = (result + v) % m;
        }

        return (int) result;
    }
}

/*
552. Student Attendance Record II
 */
