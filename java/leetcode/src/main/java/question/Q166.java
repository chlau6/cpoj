package question;

import java.util.HashMap;
import java.util.Map;

public class Q166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder builder = new StringBuilder();

        if ((numerator > 0) ^ (denominator > 0)) {
            builder.append('-');
        }

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        builder.append(n / d);

        long r = n % d;

        if (r == 0) return builder.toString();

        builder.append('.');

        Map<Long, Integer> map = new HashMap<>();

        while (r > 0) {
            if (map.containsKey(r)) {
                builder.insert(map.get(r), "(");
                builder.append(')');

                break;
            }

            map.put(r, builder.length());
            r *= 10;
            builder.append(r / d);
            r %= d;
        }

        return builder.toString();
    }
}

/*
166. Fraction to Recurring Decimal
 */