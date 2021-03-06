package question;

public class Q171 {
    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (char c : columnTitle.toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }

        return sum;
    }
}

/*
171. Excel Sheet Column Number
 */
