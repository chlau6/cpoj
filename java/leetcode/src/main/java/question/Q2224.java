
package question;

public class Q2224 {
    public int convertTime(String current, String correct) {
        int result = 0;
        int[] ops = new int[]{60, 15, 5, 1};

        int diff = Math.abs(convert(current) - convert(correct));

        for (int op : ops) {
            result += diff / op;
            diff %= op;
        }

        return result;
    }

    public int convert(String current) {
        return Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3));
    }
}

/*
2224. Minimum Number of Operations to Convert Time
 */
