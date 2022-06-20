package question;

public class Q1252 {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] rowOdd = new boolean[m];
        boolean[] colOdd = new boolean[n];

        for (int[] index : indices) {
            rowOdd[index[0]] ^= true;
            colOdd[index[1]] ^= true;
        }

        int rowOddCount = 0;
        int colOddCount = 0;

        for (boolean r : rowOdd) {
            rowOddCount += r ? 1 : 0;
        }

        for (boolean c : colOdd) {
            colOddCount += c ? 1 : 0;
        }

        return rowOddCount * n + colOddCount * m - 2 * rowOddCount * colOddCount;
    }
}

/*
1252. Cells with Odd Values in a Matrix
 */
