package question;

public class Q1979 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return gcd(max, min);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
/*
1974. Minimum Time to Type Word Using Special Typewriter
 */
