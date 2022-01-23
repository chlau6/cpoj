package question;

import java.util.Arrays;

public class Q1175 {
    public int numPrimeArrangements(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, 2, n + 1, true);

        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (primes[i]) count++;
        }

        return (int) (factorial(count) * factorial(n - count) % 1000000007);
    }

    public long factorial(int num) {
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i % 1000000007;
        }

        return result;
    }
}

/*
1160. Find Words That Can Be Formed by Characters
 */
