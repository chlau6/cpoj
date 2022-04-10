#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sortEvenOdd(vector<int>& nums) {
        priority_queue<int> odd;
        priority_queue<int, vector<int>, greater<int>> even;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.push(nums[i]);
            } else {
                odd.push(nums[i]);
            }
        }

        vector<int> result(n);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = even.top();
                even.pop();
            } else {
                result[i] = odd.top();
                odd.pop();
            }
        }

        return result;
    }
};