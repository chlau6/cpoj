package question;

public class Q11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;

        while (i < j) {
            int volume = Math.min(height[i], height[j]) * (j - i);
            result = Math.max(result, volume);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}

/*
11. Container With Most Water
 */
