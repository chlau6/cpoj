package question;

import java.util.HashMap;
import java.util.Map;

public class Q1396 {
    class UndergroundSystem {
        Map<Integer, Object[]> checkIn = new HashMap<>(); // key: customerId, value: {station, t};
        Map<String, int[]> averageTime = new HashMap<>(); // key: routine, value: {totalTime, size};

        public UndergroundSystem() {

        }

        public void checkIn(int id, String stationName, int t) {
            checkIn.put(id, new Object[]{stationName, t});
        }

        public void checkOut(int id, String stationName, int t) {
            Object[] checkInStatus = checkIn.get(id);

            String key = (String) checkInStatus[0] + " " + stationName;
            int time = t - (int) checkInStatus[1];

            int[] value = averageTime.computeIfAbsent(key, k -> new int[2]);
            value[0] += time;
            value[1]++;

            checkIn.remove(id);
        }

        public double getAverageTime(String startStation, String endStation) {
            int[] value = averageTime.get(startStation + " " + endStation);

            return (double) value[0] / value[1];
        }
    }
}

/*
1396. Design Underground System
 */
