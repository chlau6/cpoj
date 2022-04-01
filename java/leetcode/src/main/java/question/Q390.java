package question;

public class Q390 {
    public int lastRemaining(int n) {
        return leftToRight(n);
    }

    public int leftToRight(int n) {
        if (n <= 2) return n;

        return 2 * rightToLeft(n / 2);
    }

    public int rightToLeft(int n) {
        if (n <= 2) return 1;

        if (n % 2 == 1) return 2 * leftToRight(n / 2);

        return 2 * leftToRight(n / 2) - 1;
    }
}

/*
390. Elimination Game
 */
