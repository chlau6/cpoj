package question;

import annotation.Array;
import annotation.HashTable;
import annotation.Strings;

import java.util.HashSet;
import java.util.Set;

@Array
@HashTable
@Strings
public class Q804 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(m)
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {
            var builder = new StringBuilder();
            for (char c : word.toCharArray()) {
                builder.append(code[c - 'a']);
            }

            set.add(builder.toString());
        }

        return set.size();
    }
}

/*
804. Unique Morse Code Words
 */
