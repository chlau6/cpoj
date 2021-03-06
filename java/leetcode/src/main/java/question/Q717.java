package question;

public class Q717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;

        while (i < bits.length - 1) {
            if (bits[i++] == 1) {
                i++;
            }
        }

        return i == bits.length - 1;
    }
}

/*
717. 1-bit and 2-bit Characters
 */
