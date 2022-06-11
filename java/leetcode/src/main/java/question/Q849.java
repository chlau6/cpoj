package question;

public class Q849 {
    public int maxDistToClosest(int[] seats) {
        int i = 0;
        int n = seats.length;
        int result = 0;

        for (int j = 0; j < n; j++) {
            if (seats[j] == 0) continue;

            if (i == 0) {
                result = Math.max(result, j - i);
            } else {
                result = Math.max(result, (j - i + 1) / 2);
            }

            i = j + 1;
        }

        result = Math.max(result, n - i);

        return result;
    }
}

/*
849. Maximize Distance to Closest Person
 */
