package question;

public class Q1629 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int longest = releaseTimes[0];
        char result = keysPressed.charAt(0);

        for (int i = 1; i < n; i++) {
            char c = keysPressed.charAt(i);

            int duration = releaseTimes[i] - releaseTimes[i - 1];

            if (duration > longest || duration == longest && c > result) {
                longest = duration;
                result = c;
            }
        }

        return result;
    }
}

/*
1629. Slowest Key
 */
