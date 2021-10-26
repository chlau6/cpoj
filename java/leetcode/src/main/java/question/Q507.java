package question;

import annotation.Maths;

@Maths
public class Q507 {
    /*
    Time Complexity: O(sqrt(n))   Space Complexity: O(1)
     */
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int sqrt = (int) Math.sqrt(num);

        int sum = 1;

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum = sum + i + num / i;
            }
        }

        return sum == num;
    }
}

/*
507. Perfect Number
 */
