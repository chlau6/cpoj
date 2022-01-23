package question;

public class Q917 {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (!Character.isAlphabetic(chars[i])) {
                i++;
            } else if (!Character.isAlphabetic(chars[j])) {
                j--;
            } else {
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }

        return new String(chars);
    }
}

/*
917. Reverse Only Letters
 */
