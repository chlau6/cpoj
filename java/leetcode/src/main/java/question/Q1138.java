package question;

public class Q1138 {
    public String alphabetBoardPath(String target) {
        StringBuilder builder = new StringBuilder();
        int x = 0;
        int y = 0;

        for (char c : target.toCharArray()) {
            int newX = (c - 'a') % 5;
            int newY = (c - 'a') / 5;

            for (int i = 0; i < Math.max(0, y - newY); i++) {
                builder.append('U');
            }

            for (int i = 0; i < Math.max(0, newX - x); i++) {
                builder.append('R');
            }

            for (int i = 0; i < Math.max(0, x - newX); i++) {
                builder.append('L');
            }

            for (int i = 0; i < Math.max(0, newY - y); i++) {
                builder.append('D');
            }

            builder.append('!');

            x = newX;
            y = newY;
        }

        return builder.toString();
    }
}

/*
1138. Alphabet Board Path
 */
