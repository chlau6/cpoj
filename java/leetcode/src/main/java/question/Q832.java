package question;

public class Q832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;

        for (int[] row : image) {
            int i = 0;
            int j = n - 1;

            while (i <= j) {
                int temp = row[i] ^ 1;
                row[i++] = row[j] ^ 1;
                row[j--] = temp;
            }
        }

        return image;
    }
}

/*
832. Flipping an Image
 */
