package question;

public class Q504 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        var builder = new StringBuilder();

        int absNum = Math.abs(num);

        while (absNum != 0) {
            builder.append(absNum % 7);
            absNum /= 7;
        }

        if (num < 0) {
            builder.append('-');
        }

        return builder.reverse().toString();
    }
}

/*
504. Base 7
 */
