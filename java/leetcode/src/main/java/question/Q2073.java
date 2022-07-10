package question;

public class Q2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;
        int n = tickets.length;

        for (int i = 0; i < n; i++) {
            result += Math.min(tickets[k] - (i > k ? 1 : 0), tickets[i]);
        }

        return result;
    }
}
/*
2073. Time Needed to Buy Tickets
 */
