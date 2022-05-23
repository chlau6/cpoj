package question;

public class Q2240 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if (total < cost1 && total < cost2) return 1;

        long result = 0;

        for (int i = 0; i <= total / cost1; i++) {
            int remain = total - i * cost1;

            result += (remain / cost2) + 1;
        }

        return result;
    }
}

/*
2240. Number of Ways to Buy Pens and Pencils
 */
