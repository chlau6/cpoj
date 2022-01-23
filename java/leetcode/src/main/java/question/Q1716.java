package question;

public class Q1716 {
    public int totalMoney(int n) {
        int week = n / 7;
        int day = n % 7;

        return (56 + 7 * (week - 1)) * week / 2 + (2 * week + day + 1) * day / 2;
    }
}

/*
1716. Calculate Money in Leetcode Bank
 */
