package question;

public class Q476 {
    public int findComplement(int num) {
        int result = 0;
        int shift = 0;

        while (num != 0) {
            result = (((num & 1) ^ 1) << shift) + result;
            shift++;
            num >>= 1;
        }

        return result;
    }
}

/*
476. Number Complement
 */
