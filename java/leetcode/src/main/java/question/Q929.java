package question;

import java.util.HashSet;
import java.util.Set;

public class Q929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            int atPos = email.indexOf('@');

            var builder = new StringBuilder();

            for (char c : email.toCharArray()) {
                if (c == '+' || c == '@') break;
                else if (Character.isAlphabetic(c)) builder.append(c);
            }

            builder.append(email, atPos, email.length());
            set.add(builder.toString());
        }

        return set.size();
    }
}

/*
929. Unique Email Addresses
 */
