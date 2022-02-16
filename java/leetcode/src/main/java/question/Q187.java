package question;

import java.util.*;

public class Q187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();
        Set<String> sequence = new HashSet<>();
        int n = s.length();

        for (int i = 0; i <= n - 10; i++) {
            String seq = s.substring(i, i + 10);

            if (!sequence.add(seq)) {
                result.add(seq);
            }
        }

        return new ArrayList<>(result);
    }

    /*
    Bit Manipulation
     */
    public List<String> findRepeatedDnaSequences2(String s) {
        if (s.length() < 10) return new ArrayList<>();

        Map<Character, Integer> map = Map.of('A', 0, 'C', 1, 'G', 2, 'T', 3);
        Set<String> result = new HashSet<>();
        Set<Integer> sequences = new HashSet<>();
        int n = s.length();
        int seq = 0;

        for (int i = 0; i < 9; i++) {
            seq = (seq << 2) | map.get(s.charAt(i));
        }

        for (int i = 9; i < n; i++) {
            seq = ((seq & 0b00111111111111111111) << 2) | map.get(s.charAt(i));
            if (!sequences.add(seq)) {
                result.add(s.substring(i - 9, i + 1));
            }
        }

        return new ArrayList<>(result);
    }
}

/*
187. Repeated DNA Sequences
 */