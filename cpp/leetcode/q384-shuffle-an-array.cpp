#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> v;

    Solution(vector<int>& nums) {
        v = nums;
    }

    vector<int> reset() {
        return v;
    }

    vector<int> shuffle() {
        vector<int> result = v;
        int n = result.size();

        for (int i = n - 1; i > 0; i--) {
            int j = rand() % (i + 1);
            swap(result[i], result[j]);
        }

        return result;
    }
};