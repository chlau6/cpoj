package question;

public class Q7 {
    /*
    Time Complexity: O(log n)  Space Complexity: O(1)
     */
    public int reverse(int x) {
        int bound = Integer.MAX_VALUE / 10;
        int result = 0;

        while (x != 0) {
            if (Math.abs(result) > bound) return 0;

            result = result * 10 + x % 10;
            x /= 10;
        }

        return result;
    }
}

/*
7. ReverseInteger
 */