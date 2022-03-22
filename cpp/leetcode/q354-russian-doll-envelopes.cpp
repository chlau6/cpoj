#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxEnvelopes(vector<vector<int>>& envelopes) {
        int n = envelopes.size();

        if (n < 2) return n;

        sort(envelopes.begin(), envelopes.end(), [](vector<int>& a, vector<int>& b) {
           return a[0] != b[0] ? a[0] < b[0] : a[1] > b[1];
        });

        vector<int> dp(n);
        int size = 0;

        for (auto& e : envelopes) {
            int left = 0;
            int right = size;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (dp[mid] < e[1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            dp[left] = e[1];

            if (left == size) size++;
        }

        return size;
    }
};