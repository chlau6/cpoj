package question;

public class Q1689 {
    public int minPartitions(String n) {
        int len = n.length();
        int result = 0;

        for (int i = 0; i < len; i++) {
            result = Math.max(result, n.charAt(i) - '0');
        }

        return result;
    }
}

/*
1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
 */
