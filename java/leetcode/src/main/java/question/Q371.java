
package question;

public class Q371 {
    public int getSum(int a, int b) {
        int carry = 0;

        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}

/*
368. Largest Divisible Subset
 */
