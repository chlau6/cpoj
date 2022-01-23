package question;

public class Q824 {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");

        var builder = new StringBuilder();
        var a = new StringBuilder("a");

        for (String word : words) {
            char c = Character.toLowerCase(word.charAt(0));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                builder.append(word);
            } else {
                builder.append(word.substring(1)).append(word.charAt(0));
            }

            builder.append("ma").append(a).append(" ");
            a.append("a");
        }

        return builder.substring(0, builder.length() - 1);
    }
}

/*
824. Goat Latin
 */
