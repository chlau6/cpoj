package question;

import annotation.Array;

@Array
public class Q1455 {
    /*
    Time Complexity: O(mn)  Space Complexity: O(1)
     */
    public int isPrefixOfWord(String sentence, String searchWord) {
        sentence = " " + sentence;
        searchWord = " " + searchWord;
        int result = 0;

        int pos = sentence.indexOf(searchWord);

        if (pos == -1) return -1;

        for (int i = 0; i < pos; i++) {
            if (sentence.charAt(i) == ' ') result++;
        }

        return result + 1;
    }
}

/*
1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */
