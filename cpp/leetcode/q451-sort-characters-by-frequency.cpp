#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string frequencySort(string s) {
        int n = s.size();
        vector<vector<int>> buckets(128, vector<int>(2));

        for (char c : s) {
            buckets[c][0] = c;
            buckets[c][1]++;
        }

        sort(buckets.begin(), buckets.end(), [](vector<int>& a, vector<int>& b) {
            return a[1] > b[1];
        });

        int j = 0;

        for (auto& bucket : buckets) {
            char c = (char) bucket[0];
            int freq = bucket[1];

            for (int i = 0; i < freq; i++) {
                s[j++] = c;
            }
        }

        return s;
    }
};