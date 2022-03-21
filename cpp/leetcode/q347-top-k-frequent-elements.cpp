#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> map;
        priority_queue<pair<int, int>> pq;
        vector<int> result(k);

        for (int num : nums) {
            map[num]++;
        }

        for (auto it = map.begin(); it != map.end(); it++) {
            pq.push(make_pair(it->second, it->first));
        }

        for (int i = 0; i < k; i++) {
            result[i] = pq.top().second;
            pq.pop();
        }

        return result;
    }
};