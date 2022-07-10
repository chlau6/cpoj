package question;

import java.util.Arrays;

public class Q2332 {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);

        int m = buses.length;
        int n = passengers.length;
        int prev = 0;

        int result = 0;
        int j = 0;

        for (int i = 0; i < m; i++) {
            int currBus = buses[i];

            int count = 0;

            while (j < n && count < capacity && passengers[j] <= currBus) {
                if (passengers[j] - prev > 1) {
                    result = passengers[j] - 1;
                }

                prev = passengers[j];
                j++;
                count++;
            }

            if (count < capacity && buses[i] - prev >= 1) {
                result = currBus;
            }
        }

        return result;
    }
}

/*
2320. Count Number of Ways to Place Houses
 */
