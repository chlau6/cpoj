#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximumProduct(vector<int>& nums, int k) {
        priority_queue<int, vector<int>, greater<int>> pq;
        int m = 1000000007;

        for (int num : nums) {
            pq.push(num);
        }

        while (--k >= 0) {
            int top = pq.top();
            pq.pop();
            pq.push(++top);
        }

        long result = 1;

        while (!pq.empty()) {
            result = result * pq.top() % m;
            pq.pop();
        }

        return result;
    }
};