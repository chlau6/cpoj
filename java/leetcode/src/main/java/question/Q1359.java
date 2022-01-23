package question;

public class Q1359 {
    public int countOrders(int n) {
        long ans = 1;

        for (int i = 2; i <= n; i++) {
            int space = (i - 1) * 2 + 1;
            int sum = (space + 1) * space / 2;

            ans *= sum;
            ans %= 1000000007;
        }

        return (int) ans;
    }
}

/*
1359. Count All Valid Pickup and Delivery Options
 */


/*
 _ P1 _ D1 _
 P2 D2 P1 D1    P2 P1 D2 D1     P2 P1 D1 D2
 P1 P2 D2 D1    P1 P2 D1 D2
 P1 D1 P2 D2
 */

