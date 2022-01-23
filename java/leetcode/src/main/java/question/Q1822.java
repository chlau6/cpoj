package question;

public class Q1822 {
    public int arraySign(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 0) return 0;
            else if (num < 0) count++;
        }

        return count % 2 == 0 ? 1 : -1;
    }
}

/*
1822. Sign of the Product of an Array
 */
