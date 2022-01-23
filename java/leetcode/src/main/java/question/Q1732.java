package question;

public class Q1732 {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int result = 0;

        for (int g : gain) {
            altitude += g;
            result = Math.max(result, altitude);
        }

        return result;
    }
}

/*
1732. Find the Highest Altitude
 */
