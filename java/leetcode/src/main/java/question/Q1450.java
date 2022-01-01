package question;

public class Q1450 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                result++;
            }
        }

        return result;
    }
}

/*
1450. Number of Students Doing Homework at a Given Time
 */
