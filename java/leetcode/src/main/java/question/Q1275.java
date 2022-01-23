package question;

public class Q1275 {
    public String tictactoe(int[][] moves) {
        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < moves.length; i++) {
            int[] player = (i % 2 == 0) ? a : b;

            int r = moves[i][0];
            int c = moves[i][1];

            player[r]++;
            player[c + 3]++;

            if (r == c) player[6]++;
            if (r == 2 - c) player[7]++;
        }

        for (int i = 0; i < 8; i++) {
            if (a[i] == 3) return "A";
            else if (b[i] == 3) return "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}

/*
1275. Find Winner on a Tic Tac Toe Game
 */
