#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> set(nums.begin(), nums.end());
        int result = 0;

        for (int num : nums) {
            if (!set.count(num)) continue;

            set.erase(num);

            int prev = num - 1;
            int next = num + 1;

            while (set.count(prev)) {
                set.erase(prev--);
            }

            while (set.count(next)) {
                set.erase(next++);
            }

            result = max(result, next - prev - 1);
        }

        return result;
    }
};