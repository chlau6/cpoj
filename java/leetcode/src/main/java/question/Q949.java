package question;

public class Q949 {
    public String largestTimeFromDigits(int[] arr) {
        int n = arr.length;
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || i == k || j == k) continue;

                    String hour = arr[i] + "" + arr[j];
                    String min = arr[k] + "" + arr[6 - i - j - k];

                    if (hour.compareTo("23") > 0 || min.compareTo("59") > 0) continue;

                    String temp = hour + ":" + min;

                    if (temp.compareTo(result) > 0) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}

/*
949. Largest Time for Given Digits
 */
