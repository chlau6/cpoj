
package question;

public class Q345 {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;

        char[] chars = s.toCharArray();

        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            } else {
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }

        return new String(chars);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

/*
345. Reverse Vowels of a String
 */
