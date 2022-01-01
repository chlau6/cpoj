package question;

public class Q1013 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        if (sum % 3 != 0) return false;

        int average = sum / 3;
        int count = 0;
        int temp = 0;

        for (int num : arr) {
            temp += num;

            if (temp == average) {
                count++;
                temp = 0;
            }
        }

        return count >= 3;
    }
}

/*
1013. Partition Array Into Three Parts With Equal Sum
 */
