package question;

import java.util.Arrays;

public class Q253 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int minMeetingRooms(int[][] intervals) {
        int len = intervals.length;
        int[] start = new int[len];
        int[] end = new int[len];

        for (int i = 0; i < len; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int meetingRooms = 0;
        int j = 0;

        for (int i = 0; i < len; i++) {
            if (start[i] < end[j]) {
                meetingRooms++;
            } else {
                j++;
            }
        }

        return meetingRooms;
    }
}

/*
253. Meeting Rooms II
 */