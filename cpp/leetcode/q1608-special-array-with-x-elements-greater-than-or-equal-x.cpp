#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int specialArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> counts(n + 1);

        for (int num : nums) {
            if (num > n) {
                counts[n]++;
            } else {
                counts[num]++;
            }
        }

        for (int i = n; i > 0; i--) {
            if (counts[i] == i) return i;

            counts[i - 1] += counts[i];
        }

        return -1;
    }
};