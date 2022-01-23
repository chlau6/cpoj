package question;

public class Q1009 {
    public int bitwiseComplement(int n) {
        int ones = 1;

        while (n > ones) {
            ones = (ones << 1) + 1;
        }

        return n ^ ones;
    }
}

/*
1009. Complement of Base 10 Integer
 */
