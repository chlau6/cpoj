package question;

public class Q204 {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int result = 0;

        for (int i = 2; i < n; i++) {
            if (notPrime[i]) continue;

            result++;

            for (int j = i; j < n; j += i) {
                notPrime[j] = true;
            }
        }

        return result;
    }
}

/*
204. Count Primes
 */
