
package question;

public class Q372 {
    public int superPow(int a, int[] b) {
        int result = 1;
        int n = b.length;

        for (int i = 0; i < n; i++) {
            result = pow(result, 10) * pow(a, b[i]) % 1337;
        }

        return (int) result;
    }

    public int pow(int num, int index) {
        if (index == 0) return 1;
        if (index == 1) return num % 1337;

        return pow(num % 1337, index / 2) * pow(num % 1337, index - index / 2) % 1337;
    }
}

/*
372. Super Pow
 */
