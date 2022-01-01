package question;

public class Q326 {
    /*
    Time Complexity: O(log n)  Space Complexity: O(1)
     */
    public boolean isPowerOfThree(int n) {
        while (n > 1 && n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
/*
326. Power of Three
 */
