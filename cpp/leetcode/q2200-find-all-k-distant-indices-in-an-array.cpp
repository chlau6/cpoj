#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findKDistantIndices(vector<int>& nums, int key, int k) {
        vector<int> result;

        int n = nums.size();
        int pointer = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != key) continue;

            int from = max(pointer, i - k);
            int to = max(n - 1, i + k);

            for (int j = from; j <= to; j++) {
                result.push_back(j);
            }

            pointer = to + 1;
        }

        return result;
    }
};