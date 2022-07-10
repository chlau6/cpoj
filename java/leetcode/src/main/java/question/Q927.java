package question;

public class Q927 {
    public int[] threeEqualParts(int[] arr) {
        int numOne = 0;

        for (int a : arr) {
            if (a == 1) numOne++;
        }

        int[] result = {-1, -1};

        if (numOne == 0) return new int[]{0, 2};
        if (numOne % 3 != 0) return result;

        int indexThird = 0;
        int temp = 0;
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                temp++;

                if (temp == numOne / 3) {
                    indexThird = i;
                    break;
                }
            }
        }

        int result1 = findEndIndex(arr, 0, indexThird);
        if (result1 < 0) return result;

        int result2 = findEndIndex(arr, result1 + 1, indexThird);
        if (result2 < 0) return result;

        return new int[]{result1, result2 + 1};
    }

    private int findEndIndex(int[] arr, int left, int right) {
        while (arr[left] == 0) left++;

        int n = arr.length;
        while (right < n) {
            if (arr[left] != arr[right]) return -1;

            left++;
            right++;
        }

        return left - 1;
    }
}

/*
927. Three Equal Parts
 */
