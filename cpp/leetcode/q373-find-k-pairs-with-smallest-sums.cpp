#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    struct Compare {
        bool operator()(vector<int>& a, vector<int>& b) {
            return a[0] + a[1] > b[0] + b[1];
        }
    };

    vector<vector<int>> kSmallestPairs(vector<int>& nums1, vector<int>& nums2, int k) {
        priority_queue<vector<int>, vector<vector<int>>, Compare> pq;
        vector<vector<int>> result;

        int n = min((int) nums1.size(), k);
        int m = nums2.size();

        for (int i = 0; i < n; i++) {
            pq.push({nums1[i], nums2[0], 0});
        }

        while (--k >= 0 && !pq.empty()) {
            vector<int> root = pq.top();
            pq.pop();

            result.push_back({root[0], root[1]});

            if (root[2] == m - 1) continue;

            pq.push({root[0], nums2[root[2] + 1], root[2] + 1});
        }

        return result;
    }
};