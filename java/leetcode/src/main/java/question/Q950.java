package question;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        Queue<Integer> q = new LinkedList<>();

        Arrays.sort(deck);

        for (int i = 0; i < n; i++) {
            q.add(i);
        }

        for (int i = 0; i < n; i++) {
            result[q.poll()] = deck[i];
            q.add(q.poll());
        }

        return result;
    }
}

/*
950. Reveal Cards In Increasing Order
 */
