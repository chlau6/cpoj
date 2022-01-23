package question;

public class Q169 {
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
