#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> v;

    Solution(vector<int>& nums) {
        v = nums;
    }

    int pick(int target) {
        int result = 0;
        int count = 0;
        int n = v.size();

        for (int i = 0; i < n; i++) {
            if (v[i] != target) continue;

            count++;
            if (rand() % count == 0) {
                result = i;
            }
        }

        return result;
    }
};