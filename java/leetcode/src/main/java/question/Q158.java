package question;

public class Q158 {
    public class Solution extends Reader4 {
        private int pointer = 0;
        private int len = 0;
        private char[] temp = new char[4];

        public int read(char[] buf, int n) {
            int index = 0;
            while (index < n) {
                if (pointer == 0) {
                    len = read4(temp);
                }
                if (len == 0) {
                    break;
                }
                while (index < n && pointer < len) {
                    buf[index++] = temp[pointer++];
                }

                if (pointer >= len) {
                    pointer = 0;
                }
            }
            return index;
        }
    }

    class Reader4 {
        int read4(char[] buf4) {
            return 0;
        }
    }
}

/*
158. Read N Characters Given Read4 II - Call multiple times
 */