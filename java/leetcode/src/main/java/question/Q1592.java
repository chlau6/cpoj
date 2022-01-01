package question;

public class Q1592 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String reorderSpaces(String text) {
        int count = 0;
        int length = text.length();
        String[] words = text.trim().split("\\s+");

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') count++;
        }

        int gap = words.length <= 1 ? 0 : count / (words.length - 1);
        int trailing = count - gap * (words.length - 1);

        return String.join(" ".repeat(gap), words) + " ".repeat(trailing);
    }
}

/*
1592. Rearrange Spaces Between Words
 */
