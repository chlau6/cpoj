package question;

public class Q1945 {
    public int getLucky(String s, int k) {
        int result = 0;
        int temp = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int num = s.charAt(i) - 'a' + 1;
            result += num / 10 + num % 10;
        }

        while (--k > 0) {
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }

            result = temp;
            temp = 0;
        }

        return result;
    }
}

/*
1945. Sum of Digits of String After Convert
 */
