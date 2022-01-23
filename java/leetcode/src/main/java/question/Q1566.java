package question;

public class Q1566 {
    public boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;
        int length = arr.length;

        for (int i = 0; i + m < length; i++) {
            count = (arr[i] == arr[i + m]) ? count + 1 : 0;

            if (count == (k - 1) * m) return true;
        }

        return false;
    }
}

/*
1566. Detect Pattern of Length M Repeated K or More Times
 */
