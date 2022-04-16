#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool divideArray(vector<int>& nums) {
        vector<int> counts(501);

        for (int num : nums) {
            counts[num]++;
        }

        for (int count : counts) {
            if (count % 2 != 0) return false;
        }

        return true;
    }
};