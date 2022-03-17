package question;

public class Q307 {
    class NumArray {
        int[] tree;
        int n;

        public NumArray(int[] nums) {
            n = nums.length;
            tree = new int[n * 2];

            for (int i = n; i < n * 2; i++) {
                tree[i] = nums[i - n];
            }

            for (int i = n - 1; i > 0; i--) {
                tree[i] = tree[i * 2] + tree[i * 2 + 1];
            }
        }

        public void update(int index, int val) {
            int i = index + n;

            tree[i] = val;

            while (i > 0) {
                tree[i / 2] = tree[i] + tree[i ^ 1];
                i /= 2;
            }
        }

        public int sumRange(int left, int right) {
            int sum = 0;

            int i = left + n;
            int j = right + n;

            while (i <= j) {
                if (i % 2 == 1) sum += tree[i++];
                if (j % 2 == 0) sum += tree[j--];

                i /= 2;
                j /= 2;
            }

            return sum;
        }
    }
}

/*
307. Range Sum Query - Mutable
 */
