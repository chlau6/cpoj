#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> twoOutOfThree(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3) {
        vector<vector<int>> counts(3, vector<int>(101));

        for (int num : nums1) {
            counts[0][num] = 1;
        }

        for (int num : nums2) {
            counts[1][num] = 1;
        }

        for (int num : nums3) {
            counts[2][num] = 1;
        }

        vector<int> result;

        for (int i = 0; i < 101; i++) {
            if (counts[0][i] + counts[1][i] + counts[2][i] >= 2) {
                result.push_back(i);
            }
        }

        return result;
    }
};