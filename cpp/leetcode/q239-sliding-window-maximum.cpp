#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> result;
        deque<int> deque;
        int n = nums.size();
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (!deque.empty() && deque.front() == i - k) {
                deque.pop_front();
            }

            while (!deque.empty() && nums[deque.back()] < nums[i]) {
                deque.pop_back();
            }

            deque.push_back(i);

            if (i >= k - 1) {
                result.push_back(nums[deque.front()]);
            }
        }

        return result;
    }
};