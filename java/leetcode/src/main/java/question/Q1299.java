package question;

public class Q1299 {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(rightMax, temp);
        }

        return arr;
    }
}

/*
1299. Replace Elements with Greatest Element on Right Side
 */
