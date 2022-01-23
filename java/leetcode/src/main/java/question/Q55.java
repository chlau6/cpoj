package question;

public class Q55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i > index || index >= n - 1) break;
            index = Math.max(index, i + nums[i]);
        }

        return index >= n - 1;
    }
}

/*
55. Jump Game
 */