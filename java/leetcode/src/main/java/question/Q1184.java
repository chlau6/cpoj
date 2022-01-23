package question;

public class Q1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int total = 0;
        int clockwise = 0;

        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                clockwise += distance[i];
            }

            total += distance[i];
        }

        return Math.min(clockwise, total - clockwise);
    }
}

/*
1184. Distance Between Bus Stops
 */
