#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findMaximumXOR(vector<int>& nums) {
        int result = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            unordered_set<int> set;
            mask |= (1 << i);

            for (int num : nums) {
                set.insert(num & mask);
            }

            int temp = result | (1 << i);

            for (int prefix : set) {
                if (set.count(temp ^ prefix)) {
                    result = temp;
                    break;
                }
            }
        }

        return result;
    }
};