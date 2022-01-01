package question;

public class Q605 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 1) continue;

            int prev = (i == 0) ? 0 : flowerbed[i - 1];
            int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

            if (prev + next == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n == 0;
    }
}

/*
605. Can Place Flowers
 */
