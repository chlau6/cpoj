package question;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q1244 {
    class LeaderBoard {
        Map<Integer, Integer> players;
        TreeMap<Integer, Integer> scores;

        public LeaderBoard() {
            players = new HashMap<>();
            scores = new TreeMap<>(Collections.reverseOrder());
        }

        public void addScore(int playerId, int score) {
            if (players.containsKey(playerId)) {
                int currScore = players.get(playerId);

                clearScore(currScore);
                currScore += score;

                players.put(playerId, currScore);

                if (scores.containsKey(currScore)) {
                    scores.put(currScore, scores.getOrDefault(currScore, 0) + 1);
                } else {
                    scores.put(currScore, 1);
                }
            } else {
                players.put(playerId, score);
                scores.put(score, scores.getOrDefault(score, 0) + 1);
            }
        }

        public int top(int k) {
            int sum = 0;

            for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
                if (k == 0) break;

                int score = entry.getKey();
                int occurrence = entry.getValue();

                int count = Math.min(occurrence, k);
                sum += count * score;
                k -= count;
            }

            return sum;
        }

        public void reset(int playerId) {
            int score = players.get(playerId);
            players.put(playerId, 0);
            clearScore(score);
            scores.put(0, scores.getOrDefault(score, 0) + 1);
        }

        private void clearScore(int score) {
            int count = scores.get(score);

            if (count == 1) {
                scores.remove(score);
            } else {
                scores.put(score, count - 1);
            }
        }
    }


}

/*
1055. Shortest Way to Form String
 */
