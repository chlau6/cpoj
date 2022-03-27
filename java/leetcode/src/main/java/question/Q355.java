package question;

import java.util.*;

public class Q355 {
    class Twitter {
        Map<Integer, Set<Integer>> friends = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> tweets = new HashMap<>();
        int time = 0;

        public Twitter() {

        }

        public void postTweet(int userId, int tweetId) {
            Map<Integer, Integer> tweet = tweets.computeIfAbsent(userId, k -> new HashMap<>());
            tweet.put(time++, tweetId);
        }

        public List<Integer> getNewsFeed(int userId) {
            follow(userId, userId);

            TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

            for (Integer friend : friends.get(userId)) {
                for (Map.Entry<Integer, Integer> entry : tweets.getOrDefault(friend, new HashMap<>()).entrySet()) {
                    map.put(entry.getKey(), entry.getValue());

                    if (map.size() > 10) {
                        map.pollLastEntry();
                    }
                }
            }

            return new ArrayList<>(map.values());
        }

        public void follow(int followerId, int followeeId) {
            Set<Integer> following = friends.computeIfAbsent(followerId, k -> new HashSet<>());

            following.add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            if (!friends.containsKey(followerId)) return;

            friends.get(followerId).remove(followeeId);
        }
    }
}

/*
355. Design Twitter
 */
