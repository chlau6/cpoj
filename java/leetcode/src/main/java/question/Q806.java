package question;

public class Q806 {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width = 0;

        for (char c : s.toCharArray()) {
            int digitWidth = widths[c - 'a'];

            if (width + digitWidth > 100) {
                width = digitWidth;
                lines++;
            } else {
                width += digitWidth;
            }
        }

        return new int[] {lines, width};
    }
}

/*
806. Number of Lines To Write String
 */
