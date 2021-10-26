#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        map<int, int> map;
        int length = score.size();
        vector<string> result(length, "");
        int rank = 1;

        for (int i = 0; i < length; i++) {
            map[score[i]] = i;
        }

        for (auto it = map.rbegin(); it != map.rend(); it++) {
            if (rank == 1) {
                result[it->second] = "Gold Medal";
            } else if (rank == 2) {
                result[it->second] = "Silver Medal";
            } else if (rank == 3) {
                result[it->second] = "Bronze Medal";
            } else {
                result[it->second] = to_string(rank);
            }

            rank++;
        }

        return result;
    }
};