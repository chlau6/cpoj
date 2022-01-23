package question;

public class Q157 {
    public class Solution extends Reader4 {
        public int read(char[] buf, int n) {
            // Write your code here
            int i = 0;
            char[] temp = new char[4];

            while (i < n) {
                int len = read4(temp);
                int pointer = 0;
                while (i < n && pointer < len) {
                    buf[i++] = temp[pointer++];
                }
                if (len < 4) {
                    break;
                }
            }
            return i;
        }
    }

    class Reader4 {
        int read4(char[] buf4) {
            return 0;
        }
    }
}

/*
157. Read N Characters Given Read4
 */