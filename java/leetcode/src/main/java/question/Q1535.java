package question;

public class Q1535 {
    public int getWinner(int[] arr, int k) {
        int result = arr[0];
        int win = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] > result) {
                result = arr[i];
                win = 0;
            }

            if (++win >= k) {
                break;
            }
        }

        return result;
    }
}

/*
1535. Find the Winner of an Array Game
 */
