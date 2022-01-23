package question;

public class Q1108 {
    public String defangIPaddr(String address) {
        var builder = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') {
                builder.append("[.]");
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }
}

/*
1108. Defanging an IP Address
 */
