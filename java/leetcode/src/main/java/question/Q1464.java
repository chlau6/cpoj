package question;

public class Q1464 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int maxProduct(int[] nums) {
        int largest = 0;
        int secondLargest = 0;

        for (int num : nums) {
            if (num >= largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        return (largest - 1) * (secondLargest - 1);
    }
}

/*
1464. Maximum Product of Two Elements in an Array
 */
