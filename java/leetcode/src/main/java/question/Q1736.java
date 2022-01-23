package question;

public class Q1736 {
    public String maximumTime(String time) {
        char[] t = time.toCharArray();

        if (t[0] == '?') {
            t[0] = (t[1] >= '4' && t[1] <= '9') ? '1' : '2';
        }

        if (t[1] == '?') {
            t[1] = (t[0] >= '0' && t[0] <= '1') ? '9' : '3';
        }

        if (t[3] == '?') {
            t[3] = '5';
        }

        if (t[4] == '?') {
            t[4] = '9';
        }

        return new String(t);
    }
}

/*
1736. Latest Time by Replacing Hidden Digits
 */
