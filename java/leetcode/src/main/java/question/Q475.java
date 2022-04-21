package question;

import java.util.Arrays;

public class Q475 {
    /*
    Two Pointer
     */
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int j = 0;
        int result = 0;
        int n = heaters.length;

        for (int house : houses) {
            while (j < n - 1 && Math.abs(heaters[j + 1] - house) <= Math.abs(heaters[j] - house)) {
                j++;
            }

            result = Math.max(result, Math.abs(heaters[j] - house));
        }

        return result;
    }

    /*
    Binary Search
     */
    public int findRadius2(int[] houses, int[] heaters) {
        Arrays.sort(heaters);

        int result = 0;
        int n = heaters.length;

        for (int house : houses) {
            int left = 0;
            int right = n;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (heaters[mid] < house) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            int dist1 = (right == 0) ? Integer.MAX_VALUE : house - heaters[right - 1];
            int dist2 = (right == n) ? Integer.MAX_VALUE : heaters[right] - house;

            result = Math.max(result, Math.min(dist1, dist2));
        }

        return result;
    }
}

/*
475. Heaters
 */
