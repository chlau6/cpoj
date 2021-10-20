package question;

import annotation.Array;
import annotation.PrefixSum;
import company.Facebook;

import java.util.Arrays;

@Array
@PrefixSum
@Facebook
public class Q238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Q238().productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
            System.out.println(i);
        }

        return ans;
    }
}

/*
238. Product of Array Except Self
 */