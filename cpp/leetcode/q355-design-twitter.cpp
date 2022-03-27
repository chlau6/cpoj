#include<bits/stdc++.h>

using namespace std;

class Twitter {
public:
    unordered_map<int, unordered_set<int>> friends;
    unordered_map<int, unordered_map<int, int>> tweets;
    int time = 0;

    Twitter() {

    }

    void postTweet(int userId, int tweetId) {
        tweets[userId].insert({time++, tweetId});
    }

    vector<int> getNewsFeed(int userId) {
        follow(userId, userId);

        vector<int> result;
        map<int, int> map;

        for (auto& f : friends[userId]) {
            for (auto& tweet : tweets[f]) {
                map.insert({tweet.first, tweet.second});

                if (map.size() > 10) {
                    map.erase(map.begin());
                }
            }
        }

        for (auto& entry : map) {
            result.push_back(entry.second);
        }

        reverse(result.begin(), result.end());

        return result;
    }

    void follow(int followerId, int followeeId) {
        friends[followerId].insert(followeeId);
    }

    void unfollow(int followerId, int followeeId) {
        friends[followerId].erase(followeeId);
    }
};