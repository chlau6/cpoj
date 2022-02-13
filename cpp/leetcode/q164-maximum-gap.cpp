#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximumGap(vector<int>& nums) {
        int maximum = INT_MIN;
        int minimum = INT_MAX;
        int n = nums.size();

        for (int num : nums) {
            maximum = max(maximum, num);
            minimum = min(minimum, num);
        }

        int size = (maximum - minimum) / n + 1;
        int bucket = (maximum - minimum) / size + 1;

        vector<int> maxBucket(bucket, INT_MIN);
        vector<int> minBucket(bucket, INT_MAX);

        for (int num : nums) {
            int i = (num - minimum) / size;
            maxBucket[i] = max(maxBucket[i], num);
            minBucket[i] = min(minBucket[i], num);
        }

        int result = 0;
        int prev = 0;

        for (int i = 0; i < bucket; i++) {
            if (maxBucket[i] == INT_MIN || minBucket[i] == INT_MAX) continue;

            result = max(result, minBucket[i] - maxBucket[prev]);
            prev = i;
        }

        return result;
    }
};