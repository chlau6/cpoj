package question;

public class Q172 {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}

/*
172. Factorial Trailing Zeroes
 */
