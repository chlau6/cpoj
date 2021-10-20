package question;

import annotation.Array;
import annotation.HashTable;

import java.util.ArrayList;
import java.util.List;

@Array
@HashTable
public class Q448 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = nums[index] > 0 ? -nums[index] : nums[index];
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Q448().findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
    }
}

/*
448. Find All Numbers Disappeared in an Array
 */
