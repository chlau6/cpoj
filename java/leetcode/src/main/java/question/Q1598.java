package question;

public class Q1598 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int minOperations(String[] logs) {
        int count = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                count = Math.max(--count, 0);
            } else if (!log.equals("./")) {
                count++;
            }
        }

        return count;
    }
}

/*
1598. Crawler Log Folder
 */
