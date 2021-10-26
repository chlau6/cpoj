package question;

import annotation.BitManipulation;
import annotation.Maths;

@Maths
@BitManipulation
public class Q405 {
    /*
    Time Complexity: O(1)  Space Complexity: O(log n)
     */
    public String toHex(int num) {
        var builder = new StringBuilder();

        for (int i = 0; num != 0 && i < 8; i++) {
            int digit = num & 0xf;

            if (digit >= 10) {
                builder.append((char) (87 + digit));
            } else {
                builder.append(digit);
            }

            num >>= 4;
        }

        return builder.length() == 0 ? "0" : builder.reverse().toString();
    }
}

/*
405. Convert a Number to Hexadecimal
 */
