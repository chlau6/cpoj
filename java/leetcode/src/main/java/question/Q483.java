package question;

public class Q483 {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);
        int start = (int) (Math.log(num + 1) / Math.log(2));

        for (int i = start; i >= 2; i--) {
            long left = 2;
            long right = (int) (Math.pow(num, 1.0 / (i - 1)) + 1);

            while (left < right) {
                long mid = left + (right - left) / 2;
                long sum = 0;

                for (int j = 0; j < i; j++) {
                    sum = sum * mid + 1;
                }

                if (sum == num) return String.valueOf(mid);
                else if (sum < num) left = mid + 1;
                else right = mid;
            }
        }

        return String.valueOf(num - 1);
    }
}

/*
483. Smallest Good Base
 */
