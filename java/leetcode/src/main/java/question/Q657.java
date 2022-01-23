package question;

public class Q657 {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'L') x--;
            else x++;
        }

        return x == 0 && y == 0;
    }
}

/*
657. Robot Return to Origin
 */
