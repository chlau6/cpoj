#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        vector<int> counts(101);
        int result = 0;

        for (int num : nums) {
            counts[num]++;
        }

        for (int count : counts) {
            if (count > 1) {
                result += count * (count - 1) / 2;
            }
        }

        return result;
    }
};