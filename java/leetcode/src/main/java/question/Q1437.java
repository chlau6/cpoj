package question;

public class Q1437 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public boolean kLengthApart(int[] nums, int k) {
        int pos = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;

            if (pos != -1 && i - pos - 1 < k) return false;

            pos = i;
        }

        return true;
    }
}

/*
1437. Check If All 1's Are at Least Length K Places Away
 */
