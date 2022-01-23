package question;

public class Q136 {
    public int singleNumber(int[] nums) {
        int single = 0;

        for (int num : nums) {
            single ^= num;
        }

        return single;
    }
}

/*
136. Single Number
 */
