package question;

public class Q1287 {
    public int findSpecialInteger(int[] arr) {
        int target = arr.length / 4;

        for (int i = 0; i < arr.length - target; i++) {
            if (arr[i] == arr[i + target]) return arr[i];
        }

        return -1;
    }
}

/*
1287. Element Appearing More Than 25% In Sorted Array
 */
