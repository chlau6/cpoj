package question;

public class Q50 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public double myPow(double x, int n) {
        double result = 1;

        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) result *= x;
            x *= x;
        }

        return n < 0 ? 1 / result : result;
    }
}

/*
50. Pow(x, n)
 */
