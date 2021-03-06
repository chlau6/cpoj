package question;

public class Q1952 {
    public boolean isThree(int n) {
        int root = (int) Math.sqrt(n);
        int d = 2;
        int i = 2;

        while (i <= root && d < 3) {
            if (n % i == 0) {
                d += n / i == i ? 1 : 2;
            }
            i++;
        }

        return d == 3;
    }
}

/*
1945. Sum of Digits of String After Convert
 */
