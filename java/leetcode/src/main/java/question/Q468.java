package question;

public class Q468 {
    public String validIPAddress(String queryIP) {
        if (queryIP.isEmpty()) return "Neither";

        if (isValidIPv4(queryIP)) return "IPv4";
        if (isValidIPv6(queryIP)) return "IPv6";

        return "Neither";
    }

    public boolean isValidIPv4(String ip) {
        int n = ip.length();

        if (ip.charAt(0) == '.' || ip.charAt(n - 1) == '.') return false;

        String[] parts = ip.split("\\.");
        if (parts.length != 4) return false;

        for (String part : parts) {
            if (!isValidIPv4Part(part)) return false;
        }

        return true;
    }

    public boolean isValidIPv6(String ip) {
        int n = ip.length();

        if (ip.charAt(0) == ':' || ip.charAt(n - 1) == ':') return false;

        String[] parts = ip.split(":");
        if (parts.length != 8) return false;

        for (String part : parts) {
            if (!isValidIPv6Part(part)) return false;
        }

        return true;
    }

    public boolean isValidIPv4Part(String part) {
        int n = part.length();

        if (n == 0 || n > 3) return false;

        if (part.charAt(0) == '0') return n == 1;

        for (int i = 0; i < n; i++) {
            char c = part.charAt(i);

            if (!Character.isDigit(c)) return false;
        }

        return Integer.parseInt(part) <= 255;
    }

    public boolean isValidIPv6Part(String part) {
        int n = part.length();

        if (n == 0 || n > 4) return false;

        for (int i = 0; i < n; i++) {
            char c = part.charAt(i);

            if (!(Character.isDigit(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) return false;
        }

        return true;
    }
}

/*
468. Validate IP Address
 */
