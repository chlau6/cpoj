package question;

public class Q400 {
    public int findNthDigit(int n) {
        int start = 1;
        int length = 1;
        long count = 9;

        while (count * length < n) {
            n -= count * length;
            length++;
            start *= 10;
            count *= 10;
        }

        start += (n - 1) / length;
        String s = String.valueOf(start);

        return s.charAt((n - 1) % length) - '0';
    }
}

/*
400. Nth Digit
 */
