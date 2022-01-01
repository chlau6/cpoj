package question;

public class Q169 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;

        for (int num : nums) {
            if (count == 0) {
                major = num;
                count = 1;
            } else if (major == num) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}

/*
169. Majority Element
 */
