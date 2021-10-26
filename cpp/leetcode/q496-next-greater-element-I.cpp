#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> stack;
        unordered_map<int, int> map;
        vector<int> result;

        for (int num : nums2) {
            while (!stack.empty() && stack.top() < num) {
                map[stack.top()] = num;
                stack.pop();
            }

            stack.push(num);
        }

        for (int num : nums1) {
            result.push_back(map.count(num) ? map[num] : -1);
        }

        return result;
    }
};