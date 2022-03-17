package question;

public class Q299 {
    public String getHint(String secret, String guess) {
        int[] count = new int[10];
        int n = secret.length();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            int a = secret.charAt(i) - '0';
            int b = guess.charAt(i) - '0';

            if (b == a) {
                x++;
                continue;
            }

            if (count[a] < 0) y++;
            if (count[b] > 0) y++;

            count[a]++;
            count[b]--;
        }

        return x + "A" + y + "B";
    }
}

/*
299. Bulls and Cows
 */
