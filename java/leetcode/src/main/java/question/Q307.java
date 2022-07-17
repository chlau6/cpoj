package question;

public class Q307 {
    public static void main(String[] args) {
        int i = 6;
        int n = 8;
        while (i <= n) {
            System.out.println(i);
            i += (i & -i);
        }
    }

    class NumArray {
        int[] nums;
        int[] bit;
        int n;

        public NumArray(int[] nums) {
            this.nums = nums;

            n = nums.length;
            bit = new int[n + 1];

            for (int i = 0; i < n; i++) {
                init(i, nums[i]);
            }
        }

        public void init(int i, int val) {
            i++;

            while (i <= n) {
                System.out.println(i);
                bit[i] += val;
                i += (i & -i);
            }
        }

        public void update(int index, int val) {
            int diff = val - nums[index];
            nums[index] = val;
            init(index, diff);
        }

        public int sumRange(int left, int right) {
            return getSum(right) - getSum(left - 1);
        }

        public int getSum(int i) {
            int sum = 0;
            i++;

            while (i > 0) {
                sum += bit[i];
                i -= (i & -i);
            }

            return sum;
        }
    }
}

/*
307. Range Sum Query - Mutable
 */
