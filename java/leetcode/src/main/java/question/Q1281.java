package question;

import annotation.Maths;

@Maths
public class Q1281 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }
}

/*
1281. Subtract the Product and Sum of Digits of an Integer
 */
