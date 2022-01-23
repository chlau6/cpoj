package question;

public class Q495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;

        for (int i = 1; i < timeSeries.length; i++) {
            int diff = timeSeries[i] - timeSeries[i - 1];
            count += Math.min(diff, duration);
        }

        return count + duration;
    }
}

/*
495. Teemo Attacking
 */
