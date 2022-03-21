#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    void wiggleSort(vector<int>& nums) {
        vector<int> temp = nums;
        int n = nums.size();
        int j = (n - 1) / 2;
        int k = n - 1;

        sort(temp.begin(), temp.end());

        for (int i = 0; i < n; i++) {
            nums[i] = (i % 2 == 0) ? temp[j--] : temp[k--];
        }
    }
};