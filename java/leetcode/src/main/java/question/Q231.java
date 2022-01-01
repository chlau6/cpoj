package question;

public class Q231 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n & 1);
            n >>= 1;
        }

        return count == 1;
    }
}

/*
231. Power of Two
 */
